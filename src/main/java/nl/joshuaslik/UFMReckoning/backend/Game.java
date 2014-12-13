package nl.joshuaslik.UFMReckoning.backend;

import java.util.ArrayList;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 * @author Naomi de Ridder
 * @autor <a href="http://www.bryangouldsnl/" target="_blank">Bryan van Wijk</a>
 *
 */
public class Game {

	private ArrayList<User> users = new ArrayList<User>();
	private Competition competition;

	/**
	 * Constructor
	 */
	public Game() {
		
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
	
	public void addUser(User user){
		if ((!users.contains(user)) ){
			users.add(user);
		}
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
	 * @return gives the users in this game back
	 */
	public ArrayList<User> getUsers(){
		return users;
	}
	
	
	/**
	 * Starts a new competition for this game
	 */
	public void newCompetition(){
		competition = new Competition(this);
	}

}
