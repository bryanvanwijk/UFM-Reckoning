package nl.joshuaslik.UFMReckoning;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FieldplayerTest extends TestCase {
	
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public FieldplayerTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/*
	 * === *** *** **  ** *** *** ===
	 * === Tests after this point ===
	 * === *** *** **  ** *** *** ===
	 */
	
	public void testgetID(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getID(), "raivloet");
	}
	
	public void testgetName(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getName(), "Rai Vloet");
	}
	
	public void testgetCountry(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getCountry(), "Netherlands");
	}
	
	public void testgetPrice(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getPrice(), 4000000);
	}
	
	public void testgetAttackPower(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getAttackPower(), 62);
	}
	
	public void testgetDefencePower(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getDefencePower(), 32);
	}
	
	public void testgetStamina(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getStamina(), 63);
	}
	
	
	public void testgetPosition(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getPosition(), "CAM");
	}

	public void testEquals(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 63, 32, 63, 4000000);
		assertEquals(fieldplayer1, fieldplayer1);
		assertNotSame(fieldplayer1, fieldplayer2);
	}
}
