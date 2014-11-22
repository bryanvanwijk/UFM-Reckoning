package nl.joshuaslik.UFMReckoning;

/**
 * A goalkeeper is a special kind of player with different stats. It has
 * reflexes, handling and blocking variables.
 * 
 * @author Sander
 *
 */
public class Goalkeeper extends Player {
	private int reflexes, handling, blocking;

	/**
	 * Initialises the Object.
	 * 
	 * @param id
	 *            is the playerID as a String
	 * @param firstName
	 *            is the first name of the player as a String
	 * @param lastName
	 *            is the last name of the player as a String
	 * @param country
	 *            is the country of birth of the player as a String
	 * @param refl
	 *            are the reflexes of the player as an int (1...100)
	 * @param handl
	 *            are the handling skills of the player as an int (1...100)
	 * @param blk
	 *            are the blocking skills of the player as an int (1...100)
	 * @param price
	 *            is the price of the player as an int
	 */
	public Goalkeeper(String id, String firstName, String lastName,
			String country, int refl, int handl, int blk, int price) {

		super(id, firstName, lastName, country, price);

		reflexes = refl;
		handling = handl;
		blocking = blk;
	}

	public boolean equals(Object other) {
		if (other instanceof Goalkeeper) {
			Goalkeeper that = (Goalkeeper) other;
			if (this.getID().equals(that.getID())
					&& this.getName().equals(that.getName())
					&& this.getCountry().equals(that.getCountry())
					&& this.getPrice() == that.getPrice()
					&& this.reflexes == that.reflexes
					&& this.handling == that.handling
					&& this.blocking == that.blocking) {
				return true;
			}
		}
		return false;
	}

	public int getReflexes() {
		return reflexes;
	}

	public int getHandling() {
		return handling;
	}

	public int getBlocking() {
		return blocking;
	}
}
