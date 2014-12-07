package nl.joshuaslik.UFMReckoning.backend;

import org.junit.Test;

import static org.junit.Assert.*;
import nl.joshuaslik.UFMReckoning.TestToolkit;
import nl.joshuaslik.UFMReckoning.backend.Fieldplayer;

public class FieldplayerTest {

	@Test
	public void testgetID() {
		TestToolkit.printName();
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getID(), "raivloet");
	}

	@Test
	public void testgetName() {
		TestToolkit.printName();
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getName(), "Rai Vloet");
	}

	@Test
	public void testgetCountry() {
		TestToolkit.printName();
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getCountry(), "Netherlands");
	}

	@Test
	public void testgetPrice() {
		TestToolkit.printName();
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getPrice(), 4000000);
	}

	@Test
	public void testgetAttackPower() {
		TestToolkit.printName();
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getAttackPower(), 62);
	}

	@Test
	public void testgetDefencePower() {
		TestToolkit.printName();
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getDefencePower(), 32);
	}

	@Test
	public void testgetStamina() {
		TestToolkit.printName();
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getStamina(), 63);
	}

	@Test
	public void testgetPosition() {
		TestToolkit.printName();
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		assertEquals(fieldplayer1.getPosition(), "CAM");
	}

	@Test
	public void testEquals() {
		TestToolkit.printName();
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 63, 32, 63, 4000000);
		assertEquals(fieldplayer1, fieldplayer1);
		assertNotSame(fieldplayer1, fieldplayer2);
	}
}
