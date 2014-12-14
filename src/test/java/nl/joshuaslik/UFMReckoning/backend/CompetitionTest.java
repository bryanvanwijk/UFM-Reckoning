package nl.joshuaslik.UFMReckoning.backend;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompetitionTest {
	
	@Test
	public void testConstructor() {
		ArrayList<User> users = new ArrayList<User>();
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado","ado", "Frank de Boer");
		users.add(new Human(team1, "Bryan", 5000));
		users.add(new PC(team2, "pc1", 5000));
		Game game1 = new Game(users);
		Competition competition1 = new Competition(game1);
		assertEquals(competition1, competition1);
	}
	
	@Test
	public void testDefineplayrounds1() {
		ArrayList<User> users = new ArrayList<User>();
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado", "ado", "Frank de Boer");
		Team team3 = new Team("az", "az", "piet");
		Team team4 = new Team("psv", "psv", "jan");
		users.add(new Human(team1, "Bryan", 5000));
		users.add(new PC(team2, "pc1", 5000));
		users.add(new PC(team3, "pc2", 500));
		users.add(new PC(team4, "pc3", 5000));
		Game game1 = new Game(users);
		Competition competition1 = new Competition(game1);
		competition1.DefinePlayrounds();
		assertEquals(competition1.getPlayrounds().size(), 6);
	}
	
	@Test
	public void testDefineplayrounds2() {
		ArrayList<User> users = new ArrayList<User>();
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado","ado", "Frank de Boer");
		Team team3 = new Team("az","az", "piet");
		Team team4 = new Team("psv","psv", "jan");
		users.add(new Human(team1, "Bryan", 5000));
		users.add(new PC(team2, "pc1", 5000));
		users.add(new PC(team3, "pc2", 500));
		users.add(new PC(team4, "pc3", 5000));
		Game game1 = new Game(users);
		Competition competition1 = new Competition(game1);
		competition1.DefinePlayrounds();
		assertEquals(competition1.getPlayrounds().get(1).getMatches().size(), 2);
	}
	
	@Test
	public void testComputeStandings() {
		ArrayList<User> users = new ArrayList<User>();
		Team team1 = new Team("ajax","ajax", "Frank de Boer");
		Team team2 = new Team("ado","ado", "Frank de Boer");
		Team team3 = new Team("az","az", "piet");
		Team team4 = new Team("psv","psv", "jan");
		users.add(new Human(team1, "Bryan", 5000));
		users.add(new PC(team2, "pc1", 5000));
		users.add(new PC(team3, "pc2", 500));
		users.add(new PC(team4, "pc3", 5000));
		Game game1 = new Game(users);
		Competition competition1 = new Competition(game1);
		team3.addPoints(3);
		team4.addGoals(5);
		competition1.ComputeStandings();
		assertEquals(team1.getRanking(), 3);
		assertEquals(team2.getRanking(), 3);
		assertEquals(team3.getRanking(), 1);
		assertEquals(team4.getRanking(), 2);
	}
	
	@Test
	public void testComputeStandings1() {
		ArrayList<User> users = new ArrayList<User>();
		Team team1 = new Team("ajax", "ajax", "Frank de Boer");
		Team team2 = new Team("ado","ado", "Frank de Boer");
		Team team3 = new Team("az","az", "piet");
		Team team4 = new Team("psv","psv", "jan");
		users.add(new Human(team1, "Bryan", 5000));
		users.add(new PC(team2, "pc1", 5000));
		users.add(new PC(team3, "pc2", 500));
		users.add(new PC(team4, "pc3", 5000));
		Game game1 = new Game(users);
		Competition competition1 = new Competition(game1);
		team1.addGoals(5);
		team2.addGoals(1);
		team3.addGoals(6);
		team4.addGoals(10);
		
		team1.addPoints(0);
		team2.addPoints(0);
		team3.addPoints(3);
		team4.addPoints(3);
		competition1.ComputeStandings();
		assertEquals(team1.getRanking(), 3);
		assertEquals(team2.getRanking(), 4);
		assertEquals(team3.getRanking(), 2);
		assertEquals(team4.getRanking(), 1);
	}
	
	
	

	
	
}