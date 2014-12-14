package nl.joshuaslik.UFMReckoning.backend;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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