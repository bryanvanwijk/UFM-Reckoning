package nl.joshuaslik.UFMReckoning;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testApp() {
		App.main(new String[] { "" });
	}

	@Test
	public void testReadFileTest() {
		App.main(new String[] { "readfiletest", "/data/base/players/adamsarota.xml" });
	}

	@Test
	public void testXMLParse() {
		App.main(new String[] { "xmlparse", "/data/base/players/adamsarota.xml" });
	}

	@Test
	public void testXMLSave() {
		App.main(new String[] { "xmlsave", "/data/base/players/adamsarota.xml", "build/testtarget/adamsarota.xml" });
	}

}
