package nl.joshuaslik.UFMReckoning.backend;

/**
 * @author Naomi de Ridder
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class User {

	private Team team;
	private String userName;
	private int budget; 
	
	public User(Team teamIn, String userNameIn, int budgetIn) {
		team = teamIn;
		userName = userNameIn; 
		budget = budgetIn;
	}
	
	
public int getBudget() {
	return budget; 
	}



}
