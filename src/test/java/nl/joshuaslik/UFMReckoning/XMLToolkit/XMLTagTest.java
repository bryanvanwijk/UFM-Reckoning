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
	public void testGetContent1() {
		construct();
		assertTrue(tag.getContent().equals("rootcontent"));
	}

	@Test
	public void testGetContent2() {
		construct();
		assertTrue(tag.getContent("rootname").equals("rootcontent"));
	}

	@Test
	public void testGetContent3() {
		construct();
		assertTrue(tag.getContent("rootname.subname").equals("subcontent"));
	}

	@Test(expected = NoSuchElementException.class)
	public void testGetContent4() {
		construct();
		tag.getContent("rootname.falsesubname");
	}

	@Test
	public void getElement1() {
		construct();
		XMLTag sub = null;
		sub = tag.getElement("subname");
		assertTrue(sub.getContent().equals("subcontent"));
	}

	@Test(expected = NoSuchElementException.class)
	public void getElement2() {
		construct();
		tag.getElement("falsesubname");
	}

	@Test
	public void testHasElements1() {
		construct();
		assertTrue(tag.hasElements());
	}

	@Test
	public void testHasElements2() {
		construct();
		assertFalse(tag.getElement("subname").hasElements());
	}

	@Test
	public void testHasElement() {
		construct();
		assertTrue(tag.hasElement("subname"));
	}

	@Test
	public void testElements() {
		construct();
		assertEquals(tag.elements(), 1);
	}

	@Test
	public void testHasAttribute1() {
		construct();
		assertTrue(tag.hasAttribute());
	}

	@Test
	public void testHasAttribute2() {
		construct();
		assertFalse(tag.getElement("rootname.subname").hasAttribute());
	}

	@Test
	public void testHasAttribute3() {
		construct();
		assertTrue(tag.hasAttribute("attribute1"));
	}

	@Test
	public void testHasAttribute4() {
		construct();
		assertFalse(tag.hasAttribute("fakeattribute"));
	}

	@Test
	public void testGetAttribute1() {
		construct();
		assertTrue(tag.getAttribute("attribute1").equals("value1"));
	}

	@Test(expected = NoSuchAttributeException.class)
	public void testGetAttribute2() {
		construct();
		tag.getAttribute("fakeattribute");
	}

	@Test
	public void testToString1() {
		construct();
		String expected = new StringBuilder()
				.append("<rootname attribute1=\"value1\" attribute2=\"value2\">rootcontent\n")
				.append("    <subname>subcontent</subname>\n")
				.append("</rootname>\n")
				.toString();
		assertTrue(tag.toString().equals(expected));

	}

	@Test
	public void testToString2() {
		construct();
		tag.setContent(null);
		System.out.println(tag.toString());
		String expected = new StringBuilder()
				.append("<rootname attribute1=\"value1\" attribute2=\"value2\">\n")
				.append("    <subname>subcontent</subname>\n")
				.append("</rootname>\n")
				.toString();
		assertTrue(tag.toString().equals(expected));
	}

	@Test
	public void testToString3() {
		construct();
		tag.getElement("subname").setContent("");
		System.out.println(tag.toString());
		String expected = new StringBuilder()
				.append("<rootname attribute1=\"value1\" attribute2=\"value2\">rootcontent\n")
				.append("    <subname />\n")
				.append("</rootname>\n")
				.toString();
		assertTrue(tag.toString().equals(expected));
	}
	
	@Test
	public void testToString4() {
		construct();
		tag.getElement("subname").setContent(null);
		System.out.println(tag.toString());
		String expected = new StringBuilder()
				.append("<rootname attribute1=\"value1\" attribute2=\"value2\">rootcontent\n")
				.append("    <subname />\n")
				.append("</rootname>\n")
				.toString();
		assertTrue(tag.toString().equals(expected));
	}

}
