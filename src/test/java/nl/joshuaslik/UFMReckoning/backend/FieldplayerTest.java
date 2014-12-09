package nl.joshuaslik.UFMReckoning.backend;

<<<<<<< HEAD:src/test/java/nl/joshuaslik/UFMReckoning/FieldplayerTest.java
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class FieldplayerTest extends TestCase {
	
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public FieldplayerTest( String testName )
	{
    	super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
    	return new TestSuite(FieldplayerTest.class);
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
	
	public void testEquals1(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 63, 32, 63, 4000000);
=======
import org.junit.Test;
import static org.junit.Assert.*;

import nl.joshuaslik.UFMReckoning.backend.Fieldplayer;

public class FieldplayerTest {

	@Test
	public void testgetID() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getID(), "raivloet");
	}

	@Test
	public void testgetName() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getName(), "Rai Vloet");
	}

	@Test
	public void testgetCountry() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getCountry(), "Netherlands");
	}

	@Test
	public void testgetPrice() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getPrice(), 4000000);
	}

	@Test
	public void testgetAttackPower() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getAttackPower(), 62);
	}

	@Test
	public void testgetDefencePower() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getDefencePower(), 32);
	}

	@Test
	public void testgetStamina() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getStamina(), 63);
	}

	@Test
	public void testgetPosition() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getPosition(), "CAM");
	}

	@Test
	public void testEquals() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 63, 32, 63, 4000000);
>>>>>>> 770421dd11fbe547f9ad32b0bc5cbee6deeedbad:src/test/java/nl/joshuaslik/UFMReckoning/backend/FieldplayerTest.java
		assertEquals(fieldplayer1, fieldplayer1);
		assertNotSame(fieldplayer1, fieldplayer2);
	}
	
	public void testEquals2(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloe", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertFalse(fieldplayer1.equals(fieldplayer2));
	}
	
	public void testEquals3(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloe", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertFalse(fieldplayer1.equals(fieldplayer2));
	}
	
	public void testEquals4(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Belgium", "CAM", 62, 32, 63, 4000000);
		assertFalse(fieldplayer1.equals(fieldplayer2));
	}
	
	public void testEquals5(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CM", 62, 32, 63, 4000000);
		assertFalse(fieldplayer1.equals(fieldplayer2));
	}
	
	public void testEquals6(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 61, 32, 63, 4000000);
		assertFalse(fieldplayer1.equals(fieldplayer2));
	}
	
	public void testEquals7(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 31, 63, 4000000);
		assertFalse(fieldplayer1.equals(fieldplayer2));
	}
	
	public void testEquals8(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 61, 4000000);
		assertFalse(fieldplayer1.equals(fieldplayer2));
	}
	
	public void testEquals9(){
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 3000000);
		assertFalse(fieldplayer1.equals(fieldplayer2));
	}
}
