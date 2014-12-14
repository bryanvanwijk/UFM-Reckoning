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
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado","ado", "Frank de Boer");
		Match match = new Match(team1, team2);
		playround1.addmatch(match);
		Playround playround2 = new Playround();
		assertFalse(playround1.equals(playround2));
	}
	
	@Test
	public void testequals() {
		Playround playround1 = new Playround();
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Match match = new Match(team1, team2);
		playround1.addmatch(match);
		Playround playround2 = new Playround();
		playround2.addmatch(match);
		assertEquals(playround1, playround2);
	}
	
	@Test
	public void testequals2() {
		Playround playround1 = new Playround();
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Match match = new Match(team1, team2);
		playround1.addmatch(match);
		Playround playround2 = new Playround();
		playround2.addmatch(match);
		assertFalse(playround1.equals(team1));
	}
	
	@Test
	public void testconatains() {
		Playround playround1 = new Playround();
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Team team3 = new Team("az", "az", "Frank de Boer");
		Match match = new Match(team1, team2);
		playround1.addmatch(match);
		assertTrue(playround1.contains(team1));
		assertFalse(playround1.contains(team3));
	}
	
	@Test
	public void testgetMatches() {
		Playround playround1 = new Playround();
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Match match = new Match(team1, team2);
		playround1.addmatch(match);
		assertEquals(playround1.getMatches().size(), 1);
	}
	
	@Test
	public void testdetermineResultPlayround() {
		Playround playround1 = new Playround();
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Match match = new Match(team1, team2);
		playround1.addmatch(match);
		playround1.determineResultPlayround();
		assertNotSame(playround1.getMatches().get(0).gethomegoals(), -1);
	}
	
	
}
	
	