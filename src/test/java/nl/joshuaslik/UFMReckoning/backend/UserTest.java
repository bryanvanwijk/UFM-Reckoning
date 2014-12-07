package nl.joshuaslik.UFMReckoning.backend;

import org.junit.Test;

public class UserTest {

	public void constructor() {
		User user = new User(new Team("tmname", "cchname"), "username", 1000000);
	}

	@Test
	public void testGetUserName() {
		User user = new User(new Team("teamname", "coachname"), "username",
				1000000);
		user.getUserName().equals("username");
	}
	
	@Test
	public void testGetTeam() {
		User user = new User(new Team("tmname", "cchname"), "username",
				1000000);
		user.getTeam().equals("tmname", "cchname");
	}
	
	@Test
	public void testGetBudget() {
		User user = new User(new Team("tmname", "cchname"), "username",
				1000000);
		user.getBudget().equals(1000000);
	}
}
