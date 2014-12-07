package nl.joshuaslik.UFMReckoning.backend;

public class PC extends User {

	private Team team;
	private String userName;
	private int budget;

	public PC(Team team, String userName, int budget) {
		super(team, userName, budget);

		this.team = team;
		this.userName = userName;
		this.budget = budget;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
