package nl.joshuaslik.UFMReckoning.backend;

public class Human extends User {

	private Team team;
	private String userName;
	private int budget;

	public Human(Team team, String userName, int budget) {
		super(team, userName, budget);

	}

	
}