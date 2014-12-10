package nl.joshuaslik.UFMReckoning.backend;

import java.util.ArrayList;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 * @author Naomi de Ridder
 *
 */
public class Game {

	private ArrayList<User> users;

	/**
	 * Constructor
	 */
	public Game() {
		users = null;
	}

	public void sellPlayer(String id) {
		getUser().getTeam();
		throw new UnableToSellException("Not yet possible");
	}

	public void sellPlayer(String id, User user) {
		getUser().getTeam();
		throw new UnableToSellException("Not yet possible");
	}

	public void buyPlayer(String id) {
		throw new UnableToSellException("Not yet possible");
	}

	public void buyPlayer(String id, User user) {
		throw new UnableToSellException("Not yet possible");
	}

	/**
	 * Let the PC buy and sell players
	 */
	public void PCBuy() {

	}

	/**
	 * Get the Human user
	 * 
	 * @return the Human player
	 */
	public User getUser() {
		for (int i = 0; i < users.size(); i++)
			if (users.get(i) instanceof Human)
				return users.get(i);
		return null;
	}

	/**
	 * Get a User by username
	 * 
	 * @param userName
	 *            the name of the User to get
	 * @return
	 */
	public User getUser(String userName) {
		for (int i = 0; i < users.size(); i++)
			if (users.get(i).getUserName().equals(userName))
				return users.get(i);
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public Team getTeam() {
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public Player getPlayer(String id) {
		return null;

	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public Player getPlayerByName(String name) {
		return null;

	}

	/**
	 * 
	 * @param home
	 *            the team playing home
	 * @param away
	 *            the team playing away
	 * @return
	 */
	public String playMatch(User home, User away) {
		return null;
	}

	/**
	 * 
	 * @param home
	 *            the team playing home
	 * @param away
	 *            the team playing away
	 * @return
	 */
	public String playMatch(Team home, Team away) {
		return null;
	}

}
