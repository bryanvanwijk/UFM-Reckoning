package nl.joshuaslik.UFMReckoning.backend;

import java.util.ArrayList;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 * @author Naomi de Ridder
 *
 */
public class Game {

	ArrayList<User> users;

	/**
	 * Constructor
	 */
	public Game() {
		users = null;
	}

	/**
	 * 
	 * @return
	 */
	public User getUser() {
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
