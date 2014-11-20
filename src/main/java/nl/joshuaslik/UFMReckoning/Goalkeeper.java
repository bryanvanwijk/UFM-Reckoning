package nl.joshuaslik.UFMReckoning;

/**
 * WIP
 * @author Sander
 *
 */
public class Goalkeeper extends Player {
	private int reflexes, handling, blocking;

	public Goalkeeper(String id, String firstName, String lastName,
			String country, int refl, int handl, int blk, int price, String team) {

		super(id, firstName, lastName, team, country, price);

		reflexes = refl;
		handling = handl;
		blocking = blk;
	}

	public boolean equals(Object other) {
		if (other instanceof Goalkeeper) {
			Goalkeeper that = (Goalkeeper) other;
			if (this.getID().equals(that.getID())
					&& this.getName().equals(that.getName())
					&& this.getTeam().equals(that.getTeam())
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
