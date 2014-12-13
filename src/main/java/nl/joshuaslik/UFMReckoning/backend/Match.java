package nl.joshuaslik.UFMReckoning.backend;

/**
 * @author Bryan van Wijk
 * 
 *
 */
public class Match {
	private Team hometeam, awayteam;
	private Team winner = null, loser = null;
	private int homegoals = -1, awaygoals = -1;
	
	public Match(Team hometeam, Team awayteam){
		this.hometeam = hometeam;
		this.awayteam = awayteam;
	}
	
	/**
	 * Method to determine the results of this match
	 */
	public void determineResult() {
		int attackhome = hometeam.getAttackPower();
		int defencehome = hometeam.getDefencePower();
		int staminahome = hometeam.getStamina();
		
		int attackaway = awayteam.getAttackPower();
		int defenceaway = awayteam.getDefencePower();
		int staminaaway = awayteam.getStamina();
		
		if (attackhome > attackaway) {
			winner = hometeam;
			loser = awayteam;
			homegoals = 2;
			awaygoals = 1;
		}
	
	}
	
	/**
	 * 
	 * @return gives team of the winner back or if the match isn't played yet it gives null back
	 */
	public Team getWinner(){
		return winner;
	}
	
	/**
	 * 
	 * @return gives team of the loser back or if the match isn't played yet it gives null back
	 */
	public Team getLoser(){
		return loser;
	}
	
	/**
	 * 
	 * @return gives the amount of goals from the hometeam back or if the match isn't played yet it gives -1 back
	 */
	public int gethomegoals(){
		return homegoals;
	}
	
	/**
	 * 
	 * @return gives the amount of goals from the awayteam back or if the match isn't played yet it gives -1 back
	 */
	public int getawaygoals(){
		return awaygoals;
	}
	
	/**
	 * 
	 * @return
	 */
	public Team getHomeTeam(){
		return hometeam;
	}
	
}
