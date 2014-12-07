package nl.joshuaslik.UFMReckoning.backend;

/**
 * The Player class is an abstract class.
 * 
 * @author Sander
 */

public abstract class Player {
	private String playerID, fullName, country;
	private int price;

	/**
	 * Is the superconstructor of the subclasses.
	 * 
	 * @param id
	 *            is the playerID as a String
	 * @param firstName
	 *            is the first name of the player as a String
	 * @param lastName
	 *            is the last name of the player as a String
	 * @param heritage
	 *            is the country of birth from the player as a String
	 * @param pr
	 *            is the price of the player as an int.
	 */
	public Player(String id, String firstName, String lastName,
			String heritage, int pr) {
		playerID = id;
		fullName = firstName + " " + lastName;
		country = heritage;
		price = pr;
	}

	public String getID() {
		return playerID;
	}

	public String getName() {
		return fullName;
	}

	public String getCountry() {
		return country;
	}

	public int getPrice() {
		return price;
	}
}
