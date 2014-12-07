package nl.joshuaslik.UFMReckoning.backend;

import org.junit.Test;
import static org.junit.Assert.*;
import nl.joshuaslik.UFMReckoning.TestToolkit;
import nl.joshuaslik.UFMReckoning.backend.Goalkeeper;

public class GoalkeeperTest {

	@Test
	public void testgetID() {
		TestToolkit.printName();
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet",
				"Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getID(), "pietvelthuizen");
	}

	@Test
	public void testgetName() {
		TestToolkit.printName();
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet",
				"Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getName(), "Piet Velthuizen");
	}

	@Test
	public void testgetCountry() {
		TestToolkit.printName();
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet",
				"Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getCountry(), "Netherlands");
	}

	@Test
	public void testgetPrice() {
		TestToolkit.printName();
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet",
				"Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getPrice(), 3000000);
	}

	@Test
	public void testgetReflexes() {
		TestToolkit.printName();
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet",
				"Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getReflexes(), 74);
	}

	@Test
	public void testgetDiving() {
		TestToolkit.printName();
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet",
				"Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getDiving(), 72);
	}

	@Test
	public void testgetPositioning() {
		TestToolkit.printName();
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet",
				"Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getPositioning(), 84);
	}

	@Test
	public void testEquals() {
		TestToolkit.printName();
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet",
				"Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		Goalkeeper goalkeeper2 = new Goalkeeper("pietvelthuize", "Piet",
				"Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1, goalkeeper1);
		assertNotSame(goalkeeper1, goalkeeper2);
	}
}
