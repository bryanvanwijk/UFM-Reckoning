package nl.joshuaslik.UFMReckoning.backend;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Playroundtest {
	
	@Test
	public void testConstructor() {
		Playround playround1 = new Playround();
		assertEquals(playround1, playround1);
	}
	
	@Test
	public void testaddmatch() {
		Playround playround1 = new Playround();
		Team team1 = new Team("ajax", "Frank de Boer");
		Team team2 = new Team("ado", "Frank de Boer");
		Match match = new Match(team1, team2);
		playround1.addmatch(match);
		Playround playround2 = new Playround();
		assertFalse(playround1.equals(playround2));
	}
	
	@Test
	public void testequals() {
		Playround playround1 = new Playround();
		Team team1 = new Team("ajax", "Frank de Boer");
		Team team2 = new Team("ado", "Frank de Boer");
		Match match = new Match(team1, team2);
		playround1.addmatch(match);
		Playround playround2 = new Playround();
		playround2.addmatch(match);
		assertEquals(playround1, playround2);
	}
	
	@Test
	public void testconatains() {
		Playround playround1 = new Playround();
		Team team1 = new Team("ajax", "Frank de Boer");
		Team team2 = new Team("ado", "Frank de Boer");
		Team team3 = new Team("az", "Frank de Boer");
		Match match = new Match(team1, team2);
		playround1.addmatch(match);
		assertTrue(playround1.contains(team1));
		assertFalse(playround1.contains(team3));
	}
	
	
}
	
	