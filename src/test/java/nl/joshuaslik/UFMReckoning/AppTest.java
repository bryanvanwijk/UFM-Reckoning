package nl.joshuaslik.UFMReckoning;

import nl.joshuaslik.UFMReckoning.XMLToolkit.NoSuchElementException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testApp() {
		TestToolkit.printName();
		App.main(new String[] { "" });
	}

	@Test
	public void testReadFileTest() {
		TestToolkit.printName();
		App.main(new String[] { "readfiletest", "/data/base/players/adamsarota.xml" });
	}

	@Test
	public void testXMLParse() {
		TestToolkit.printName();
		App.main(new String[] { "xmlparse", "/data/base/players/adamsarota.xml" });
	}

	@Test
	public void testXMLSave() {
		TestToolkit.printName();
		App.main(new String[] { "xmlsave", "/data/base/players/adamsarota.xml", "adamsarota2.xml" });
	}

}
