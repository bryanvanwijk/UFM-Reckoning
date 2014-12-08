package nl.joshuaslik.UFMReckoning.XMLToolkit;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;

import org.junit.Test;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class XMLTagTest {

	XMLTag tag;

	public void construct() {
		LinkedHashMap<String, String> atts = new LinkedHashMap<String, String>();
		atts.put("attribute1", "value1");
		atts.put("attribute2", "value2");
		tag = new XMLTag("rootname", atts);
		tag.setContent("rootcontent");
		atts = new LinkedHashMap<String, String>();
		atts.put("subattribute1", "subvalue1");
		atts.put("subattribute2", "subvalue2");
		XMLTag sub = new XMLTag("subname", atts);
		sub.setContent("subcontent");
		tag.addElement(sub);
	}

	@Test
	public void testConstructor() {
		construct();
	}

	@Test
	public void testGetName() {
		construct();
		assertTrue(tag.getName().equals("rootname"));
	}
	
	@Test
	public void testGetContent() {
		construct();
		assertTrue(tag.getContent().equals("rootcontent"));
		try {
			assertTrue(tag.getContent("rootname.subname").equals("subcontent"));
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void getElement() {
		construct();
		XMLTag sub = null;
		try {
			sub = tag.getElement("subname");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		assertTrue(sub.getContent().equals("subcontent"));
	}

}
