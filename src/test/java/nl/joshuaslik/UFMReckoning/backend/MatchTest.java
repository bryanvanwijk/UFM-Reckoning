package nl.joshuaslik.UFMReckoning.backend;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MatchTest {
	
	@Test
	public void testConstructor() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		team1.setTeamCaptain(fieldplayer1);
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		team2.setTeamCaptain(fieldplayer1);
		Match match = new Match(team1, team2);
		assertEquals(match, match);
	}
	
	@Test
	public void testConstructor2() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		team1.setTeamCaptain(fieldplayer1);
		Match match = new Match(team1, team1);
		assertEquals(match.getHomeTeam(), null);
	}

	
	@Test
	public void testEquals1() {
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet",
				"Netherlands", "CAM", 62, 32, 63, 4000000);
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		team1.setTeamCaptain(fieldplayer1);
		Team team2 = new Team("ajax", "ado", "Ronald de Boer");
		team2.setTeamCaptain(fieldplayer1);
		Match match = new Match(team1, team2);
		Team team3 = new Team("psv", "psv", "Frank de Boer");
		team3.setTeamCaptain(fieldplayer1);
		Team team4 = new Team("az","az", "Ronald de Boer");
		team4.setTeamCaptain(fieldplayer1);
		Match match2 = new Match(team3, team4);
		assertFalse(match.equals(match2));
	}
	
	@Test
	public void testEquals2() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match = new Match(team1, team2);
		assertFalse(match.equals(team1));
	}
	
	@Test
	public void testEquals3() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match1 = new Match(team1, team2);
		Match match2 = new Match(team2, team1);
		match1.determineResult();
		match2.determineResult();
		assertFalse(match1.equals(match2));
	}
	
	@Test
	public void testEquals4() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match1 = new Match(team1, team2);
		Match match2 = new Match(team1, team2);
		match1.setWinner(team1);
		match2.setWinner(team1);
		match1.setLoser(team2);
		match2.setLoser(team2);
		assertEquals(match1, match2);
	}
	
	@Test
	public void testEquals5() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match1 = new Match(team1, team2);
		match1.setWinner(team1);
		match1.setLoser(team2);
		match1.setHomegoals(4);
		match1.setawaygoals(3);
		assertFalse(match1.equals(null));
	}
	
	@Test
	public void testEquals6() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match1 = new Match(team1, team2);
		Match match2 = new Match(team1, team2);
		match1.setWinner(team1);
		match2.setWinner(team1);
		match1.setLoser(team2);
		match2.setLoser(team2);
		match1.setHomegoals(4);
		match1.setawaygoals(3);
		match2.setHomegoals(2);
		assertFalse(match1.equals(match2));
	}
	
	@Test
	public void testEquals7() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match1 = new Match(team1, team2);
		Match match2 = new Match(team1, team2);
		match1.setWinner(team1);
		match2.setWinner(team1);
		match1.setLoser(team2);
		match2.setLoser(team2);
		match1.setHomegoals(4);
		match1.setawaygoals(3);
		match2.setawaygoals(2);
		assertFalse(match1.equals(match2));
	}
	
	@Test
	public void testEquals8() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match1 = new Match(team1, team2);
		Match match2 = new Match(team1, team2);
		match1.setWinner(team1);
		match2.setWinner(team1);
		match2.setLoser(team2);;
		assertFalse(match1.equals(match2));
	}
	
	@Test
	public void testEquals9() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Match match1 = new Match(team1, team2);
		Match match2 = new Match(team1, team2);
		match1.setWinner(team1);
		match2.setWinner(team1);
		match1.setLoser(team2);
		match2.setLoser(team2);
		match1.setawaygoals(4);
		match1.setHomegoals(4);
		match2.setawaygoals(4);
		match2.setHomegoals(3);
		assertFalse(match1.equals(match2));
	}
	
	@Test
	public void testEquals10() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Match match1 = new Match(team1, team2);
		Match match2 = new Match(team1, team2);
		match1.setWinner(team2);
		match2.setWinner(team1);
		match1.setLoser(team2);
		match2.setLoser(team2);
		match1.setawaygoals(4);
		match1.setHomegoals(4);
		match2.setawaygoals(4);
		match2.setHomegoals(4);
		assertFalse(match1.equals(match2));
	}
	
	@Test
	public void testEquals11() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Match match1 = new Match(team1, team2);
		Match match2 = new Match(team1, team2);
		match1.setWinner(team1);
		match2.setWinner(team1);
		match1.setLoser(team1);
		match2.setLoser(team2);
		match1.setawaygoals(4);
		match1.setHomegoals(4);
		match2.setawaygoals(4);
		match2.setHomegoals(4);
		assertFalse(match1.equals(match2));
	}
	
	@Test
	public void testEquals12() {
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Match match1 = new Match(team1, team2);
		Match match2 = new Match(team1, team2);
		match1.setLoser(team1);
		match2.setLoser(team2);
		match1.setawaygoals(4);
		match1.setHomegoals(4);
		match2.setawaygoals(2);
		match2.setHomegoals(4);
		assertFalse(match1.equals(match2));
	}
	


	
	
	
	@Test
	public void testgetHomeTeam() {
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match = new Match(team1, team2);
		assertEquals(match.getHomeTeam(), team1);
	}
	
	@Test
	public void testgetAwayTeam() {
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match = new Match(team1, team2);
		assertEquals(match.getAwayTeam(), team2);
	}
	
	
	//@Test
	//public void testgetAwayGoals() {
	//	Team team1 = new Team("ajax", "ajax", "Frank de Boer");
	//	Team team2 = new Team("ado", "ado", "Ronald de Boer");
	//	Match match = new Match(team1, team2);
	//	match.setawaygoals(5);
	//	assertEquals(match.getAwaygoals(), 5);
	//}
	
	@Test
	public void testgetWinner() {
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match = new Match(team1, team2);
		match.setWinner(team1);
		assertEquals(match.getWinner(), team1);
	}
	
	@Test
	public void testgetLoser() {
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match = new Match(team1, team2);
		match.setLoser(team1);
		assertEquals(match.getLoser(), team1);
	}
	
	@Test
	public void testgetDraw() {
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Ronald de Boer");
		Match match = new Match(team1, team2);
		assertEquals(match.getDraw(), false);
	}
	

}
	
	