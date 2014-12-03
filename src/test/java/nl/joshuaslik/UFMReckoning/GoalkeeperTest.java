package nl.joshuaslik.UFMReckoning;

import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GoalkeeperTest extends TestCase {

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public GoalkeeperTest(String testName) {
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
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getID(), "pietvelthuizen");
	}
	
	
	public void testgetName(){
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getName(), "Piet Velthuizen");
	}
	
	
	public void testgetCountry(){
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getCountry(), "Netherlands");
	}
	
	
	public void testgetPrice(){
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getPrice(), 3000000);
	}
	
	
	public void testgetReflexes(){
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getReflexes(), 74);
	}
	
	
	public void testgetDiving(){
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getDiving(), 72);
	}

	public void testgetPositioning(){
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1.getPositioning(), 84);
	}
	
	public void testEquals(){
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		Goalkeeper goalkeeper2 = new Goalkeeper("pietvelthuize", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		assertEquals(goalkeeper1, goalkeeper1);
		assertNotSame(goalkeeper1, goalkeeper2);
	}
}
