package nl.joshuaslik.UFMReckoning.backend;

import Adres;
import KoopWoning;

/**
 * @author Naomi de Ridder
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class User {

	private Team team;
	private String userName;
	private int budget;

	public User(Team team, String userName, int budget) {
		this.team = team;
		this.userName = userName;
		this.budget = budget;
	}

	public int getBudget() {
		return budget;
	}

	public int addMoney(int amount) {
		budget = budget + amount;
		return budget;
	}

	public int subMoney(int amount) {
		budget = budget - amount;
		return budget;
	}

	public boolean checkCost(int amount) {
		if (budget >= amount) {
			return true;
		}
	}

	public boolean equals() {
		if (this instanceof Human) {
			return true;
		}
		return false;
	}
}
