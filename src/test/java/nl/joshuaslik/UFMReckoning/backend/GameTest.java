package nl.joshuaslik.UFMReckoning.backend;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GameTest {
	
	@Test
	public void testConstructor() {
		ArrayList<User> users = new ArrayList<User>();
		Game game1 = new Game(users);
		assertEquals(game1, game1);
	}
	
	@Test
	public void testConstructor2() {
		ArrayList<User> users = new ArrayList<User>();
		Game game1 = new Game(users);
		assertEquals(game1.getUsers(), users);
	}
	
	@Test
	public void testgetCompetition() {
		ArrayList<User> users = new ArrayList<User>();
		Game game1 = new Game(users);
		assertEquals(game1.getCompetition(), new Competition(game1));
	}
	
	
	
}