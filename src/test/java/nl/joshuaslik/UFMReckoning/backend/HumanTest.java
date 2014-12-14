package nl.joshuaslik.UFMReckoning.backend;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {
	
	User user;
	
	@Before
	public void construct() {
		user = new PC(new Team("id", "tmname", "cchname"), "username", 1000000);
	}
	
	public void testConstructor() {
		construct();
	}

	@Test
	public void testGetUserName() {
		construct();
		assertTrue(user.getUserName().equals("username"));
	}
	
	@Test
	public void testGetTeam() {
		construct();
		assertTrue(user.getTeam().getTeamName().equals("tmname"));
		assertTrue(user.getTeam().getCoachName().equals("cchname"));
	}
	
	@Test
	public void testGetBudget() {
		construct();
		assertTrue(user.getBudget() == 1000000);
	}
}
