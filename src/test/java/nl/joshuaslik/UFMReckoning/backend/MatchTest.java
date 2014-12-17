package nl.joshuaslik.UFMReckoning.backend;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchTest {
	
	@Test
	public void testConstructor() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		Team team1 = new Team("ajax", "Frank de Boer");
		team1.setTeamCaptain(fieldplayer1);
		Team team2 = new Team("ado", "Frank de Boer");
		team2.setTeamCaptain(fieldplayer1);
		Match match = new Match(team1, team2);
		assertEquals(match, match);
	}

	
	@Test
	public void testEquals1() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		Team team1 = new Team("ajax", "Frank de Boer");
		team1.setTeamCaptain(fieldplayer1);
		Team team2 = new Team("ado", "Ronald de Boer");
		team2.setTeamCaptain(fieldplayer1);
		Match match = new Match(team1, team2);
		Team team3 = new Team("psv", "Frank de Boer");
		team3.setTeamCaptain(fieldplayer1);
		Team team4 = new Team("az", "Ronald de Boer");
		team4.setTeamCaptain(fieldplayer1);
		Match match2 = new Match(team3, team4);
		assertFalse(match.equals(match2));
	}
	
	@Test
	public void testEquals2() {
		Team team1 = new Team("ajax", "Frank de Boer");
		Team team2 = new Team("ado", "Ronald de Boer");
		Match match = new Match(team1, team2);
		assertFalse(match.equals(team1));
	}
	
	@Test
	public void testgetHomeTeam() {
		Team team1 = new Team("ajax", "Frank de Boer");
		Team team2 = new Team("ado", "Ronald de Boer");
		Match match = new Match(team1, team2);
		assertEquals(match.getHomeTeam(), team1);
	}
	
	@Test
	public void testgetAwayTeam() {
		Team team1 = new Team("ajax", "Frank de Boer");
		Team team2 = new Team("ado", "Ronald de Boer");
		Match match = new Match(team1, team2);
		assertEquals(match.getAwayTeam(), team2);
	}
	
	@Test
	public void testdetermineResult() {
		Team team1 = new Team("ajax", "Frank de Boer");
		Team team2 = new Team("ado", "Ronald de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet","Netherlands", "CAM", 0, 0, 0, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet","Netherlands", "CAM", 80, 80, 90, 4000000);
		team1.addActivePlayer(fieldplayer1);
		team2.addActivePlayer(fieldplayer2);
		Match match = new Match(team1, team2);
		match.determineResult();
	}
}
	
	