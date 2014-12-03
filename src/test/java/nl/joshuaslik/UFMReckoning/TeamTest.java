package nl.joshuaslik.UFMReckoning;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class TeamTest extends TestCase {

	@Test
	public void testgetCoachName(){
		Team team = new Team("ajax", "Frank de Boer");
		assertEquals(team.getCoachName(), "Frank de Boer");
	}
	
	@Test
	public void testgetTeamName(){
		Team team = new Team("ajax", "Frank de Boer");
		assertEquals(team.getTeamName(), "ajax");
	}
	
	@Test
	public void testaddActivePlayer1(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		team.addActivePlayer(fieldplayer1);
		assertTrue(team.getActivePlayers().contains(fieldplayer1));
	}
	
	@Test
	public void testaddActivePlayer2(){
		Team team = new Team("ajax", "Frank de Boer");
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		team.addActivePlayer(goalkeeper1);
		assertTrue(team.getActivePlayers().contains(goalkeeper1));
	}
	
	@Test
	public void testaddActivePlayer3(){
		Team team = new Team("ajax", "Frank de Boer");
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		Goalkeeper goalkeeper2 = new Goalkeeper("piet", "Jan", "Velthuizen", "Netherlands", 45, 78, 80, 4000000);
		team.addActivePlayer(goalkeeper1);
		team.addActivePlayer(goalkeeper2);
		assertEquals(team.getActivePlayers().size(), 1);
	}
	
	@Test
	public void testaddActivePlayer4(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		team.addActivePlayer(fieldplayer1);
		team.addActivePlayer(fieldplayer2);
		assertEquals(team.getActivePlayers().size(), 1);
	}
	
	@Test
	public void testaddActivePlayer5(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("klaassen", "Davy", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer3 = new Fieldplayer("lucas", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer4 = new Fieldplayer("stefan", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer5 = new Fieldplayer("nick", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer6 = new Fieldplayer("ruben", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer7 = new Fieldplayer("kenny", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer8 = new Fieldplayer("ruben", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer9 = new Fieldplayer("peter", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer10 = new Fieldplayer("nicki", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer11 = new Fieldplayer("rober", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer12 = new Fieldplayer("tobias", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		team.addActivePlayer(fieldplayer1);
		team.addActivePlayer(fieldplayer2);
		team.addActivePlayer(fieldplayer3);
		team.addActivePlayer(fieldplayer4);
		team.addActivePlayer(fieldplayer5);
		team.addActivePlayer(fieldplayer6);
		team.addActivePlayer(fieldplayer7);
		team.addActivePlayer(fieldplayer8);
		team.addActivePlayer(fieldplayer9);
		team.addActivePlayer(fieldplayer10);
		team.addActivePlayer(fieldplayer11);
		team.addActivePlayer(fieldplayer12);
		team.addActivePlayer(goalkeeper1);
		assertEquals(team.getActivePlayers().size(), 11);
	}
	
	@Test
	public void testaddBenchPlayer1(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		team.addBenchPlayer(fieldplayer1);
		assertTrue(team.getBenchPlayers().contains(fieldplayer1));
	}
	
	@Test
	public void testaddBenchPlayer2(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		team.addBenchPlayer(fieldplayer1);
		team.addBenchPlayer(fieldplayer2);
		assertEquals(team.getBenchPlayers().size(), 1);
	}
	
	@Test
	public void testremoveActicePlayer1(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("piet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		team.addActivePlayer(fieldplayer1);
		team.addActivePlayer(fieldplayer2);
		assertTrue(team.getActivePlayers().contains(fieldplayer2));
		team.removeActivePlayer(fieldplayer2);
		assertFalse(team.getActivePlayers().contains(fieldplayer2));
	}
	
	@Test
	public void testremoveActicePlayer2(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("piet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		team.addActivePlayer(fieldplayer1);
		team.addActivePlayer(goalkeeper1);
		team.removeActivePlayer(fieldplayer2);
		assertEquals(team.getActivePlayers().size(), 2);
	}
	
	
	
	@Test
	public void testremoveBenchPlayer1(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("piet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		team.addBenchPlayer(fieldplayer1);
		team.addBenchPlayer(fieldplayer2);
		assertTrue(team.getBenchPlayers().contains(fieldplayer2));
		team.removeBenchPlayer(fieldplayer2);
		assertFalse(team.getBenchPlayers().contains(fieldplayer2));
	}
	
	@Test
	public void testremoveBenchPlayer2(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("piet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		team.addBenchPlayer(fieldplayer1);
		team.removeBenchPlayer(fieldplayer2);
		assertEquals(team.getBenchPlayers().size(), 1);
	}
	
	@Test
	public void testTeamCaptain(){
		Team team = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		team.setTeamCaptain(fieldplayer1);
		assertEquals(team.getTeamCaptain(), fieldplayer1);
	}
	
	@Test
	public void testEquals(){
		Team team1 = new Team("ajax", "Frank de Boer");
		Team team2 = new Team("ado", "Ronald de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("klaassen", "Davy", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer3 = new Fieldplayer("lucas", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer4 = new Fieldplayer("stefan", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer5 = new Fieldplayer("nick", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer6 = new Fieldplayer("ruben", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer7 = new Fieldplayer("kenny", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer8 = new Fieldplayer("ruben", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer9 = new Fieldplayer("peter", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer10 = new Fieldplayer("nicki", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer11 = new Fieldplayer("rober", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer12 = new Fieldplayer("tobias", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Goalkeeper goalkeeper1 = new Goalkeeper("pietvelthuizen", "Piet", "Velthuizen", "Netherlands", 74, 72, 84, 3000000);
		team1.setTeamCaptain(fieldplayer1);
		team2.setTeamCaptain(fieldplayer12);
		team1.addActivePlayer(fieldplayer1);
		team1.addActivePlayer(fieldplayer2);
		team1.addActivePlayer(fieldplayer3);
		team1.addActivePlayer(fieldplayer4);
		team1.addActivePlayer(fieldplayer5);
		team2.addActivePlayer(fieldplayer6);
		team2.addActivePlayer(fieldplayer7);
		team2.addActivePlayer(fieldplayer8);
		team2.addActivePlayer(fieldplayer9);
		team2.addActivePlayer(fieldplayer10);
		team2.addActivePlayer(fieldplayer11);
		team2.addActivePlayer(fieldplayer12);
		team2.addActivePlayer(goalkeeper1);
		assertEquals(team1, team1);
		assertNotSame(team1, team2);
	}
	
	@Test
	public void testEquals2(){
		Team team1 = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		assertNotSame(team1, fieldplayer1);
	}
	
	@Test
	public void testgetAttackPower(){
		Team team1 = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("klaassen", "Davy", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer3 = new Fieldplayer("lucas", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer4 = new Fieldplayer("stefan", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer5 = new Fieldplayer("nick", "Rai", "Vloet", "Netherlands", "CAM", 63, 32, 63, 4000000);
		team1.addActivePlayer(fieldplayer1);
		team1.addActivePlayer(fieldplayer2);
		team1.addActivePlayer(fieldplayer3);
		team1.addActivePlayer(fieldplayer4);
		team1.addActivePlayer(fieldplayer5);
		assertEquals(team1.getAttackPower(), 311);
	}
	
	@Test
	public void testgetDefencePower(){
		Team team1 = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("klaassen", "Davy", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer3 = new Fieldplayer("lucas", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer4 = new Fieldplayer("stefan", "Rai", "Vloet", "Netherlands", "CAM", 62, 33, 63, 4000000);
		Fieldplayer fieldplayer5 = new Fieldplayer("nick", "Rai", "Vloet", "Netherlands", "CAM", 63, 32, 63, 4000000);
		team1.addActivePlayer(fieldplayer1);
		team1.addActivePlayer(fieldplayer2);
		team1.addActivePlayer(fieldplayer3);
		team1.addActivePlayer(fieldplayer4);
		team1.addActivePlayer(fieldplayer5);
		assertEquals(team1.getDefencePower(), 161);
	}
	
	@Test
	public void testgetStamina(){
		Team team1 = new Team("ajax", "Frank de Boer");
		Fieldplayer fieldplayer1 = new Fieldplayer("raivloet", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 64, 4000000);
		Fieldplayer fieldplayer2 = new Fieldplayer("klaassen", "Davy", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer3 = new Fieldplayer("lucas", "Rai", "Vloet", "Netherlands", "CAM", 62, 32, 63, 4000000);
		Fieldplayer fieldplayer4 = new Fieldplayer("stefan", "Rai", "Vloet", "Netherlands", "CAM", 62, 33, 63, 4000000);
		Fieldplayer fieldplayer5 = new Fieldplayer("nick", "Rai", "Vloet", "Netherlands", "CAM", 63, 32, 63, 4000000);
		team1.addActivePlayer(fieldplayer1);
		team1.addActivePlayer(fieldplayer2);
		team1.addActivePlayer(fieldplayer3);
		team1.addActivePlayer(fieldplayer4);
		team1.addActivePlayer(fieldplayer5);
		assertEquals(team1.getStamina(), 316);
	}
	
	
	@Test
	public void testgetTotalDraws(){
		Team team1 = new Team("ajax", "Frank de Boer");
		assertEquals(team1.getTotalDraws(), 0);
	}
	
	@Test
	public void testgetTotalGoals(){
		Team team1 = new Team("ajax", "Frank de Boer");
		assertEquals(team1.getTotalGoals(), 0);
	}
	
	@Test
	public void testgetTotalLosses(){
		Team team1 = new Team("ajax", "Frank de Boer");
		assertEquals(team1.getTotalLosses(), 0);
	}
	
	@Test
	public void testgetTotalWins(){
		Team team1 = new Team("ajax", "Frank de Boer");
		assertEquals(team1.getTotalWins(), 0);
	}
	
}
