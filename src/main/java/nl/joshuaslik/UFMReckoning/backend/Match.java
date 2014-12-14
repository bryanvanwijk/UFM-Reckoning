package nl.joshuaslik.UFMReckoning.backend;

/**
 * @author Bryan van Wijk
 * 
 *
 */
public class Match {
	private Team hometeam, awayteam;
	private Team winner, loser;
	private boolean draw = false;
	private int homegoals = -1, awaygoals = -1;
	
	public Match(Team hometeam, Team awayteam){
		if(!hometeam.equals(awayteam)){
			this.hometeam = hometeam;
			this.awayteam = awayteam;
		}
	}
	private int determinegoals(int goalchance){
		if(goalchance >= 0 && goalchance <= 810){
			return 0;
		}
		else if(goalchance < 1530) {
			return 1;
		}
		else if(goalchance < 2130){
			return 2;
		}
		else if(goalchance < 2430){
			return 3;
		}
		else if(goalchance < 2640){
			return 4;
		}
		else if(goalchance < 2850){
			return 5;
		}
		else if(goalchance < 2910){
			return 6;
		}
		else if(goalchance < 2940){
			return 7;
		}
		else if(goalchance < 2970){
			return 8;
		}
		else if(goalchance < 2985){
			return 9;
		}
		else if(goalchance <= 3000){
			return 10;
		}
		else{
			return -1;
		}
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
		
		int attackpowerhome = (attackhome-defenceaway+1000);
		int homechance = (int) (Math.random()*3000);
		int homegoalschance = ((homechance*40) + ((attackpowerhome + staminahome)*60))/200;
		
		int attackpoweraway = (attackaway-defencehome+1000);
		int awaychance = (int) (Math.random()*3000);
		int awaygoalschance = ((awaychance*40) + ((attackpoweraway + staminaaway)*60))/200;
		
		homegoals = determinegoals(homegoalschance);
		awaygoals = determinegoals(awaygoalschance);
		if (homegoals > awaygoals) {
			winner = hometeam;
			loser = awayteam;
			hometeam.addGoals(homegoals);
			hometeam.addGoalsAgainst(awaygoals);
			awayteam.addGoalsAgainst(homegoals);
			awayteam.addGoals(awaygoals);
			hometeam.addPoints(3);
			hometeam.incTotalWins();
			awayteam.incTotalLosses();
		}
		else if(homegoals == awaygoals){
			hometeam.addGoals(homegoals);
			hometeam.addGoalsAgainst(awaygoals);
			awayteam.addGoalsAgainst(homegoals);
			awayteam.addGoals(awaygoals);
			hometeam.addPoints(1);
			awayteam.addPoints(1);
			hometeam.incTotalDraws();
			awayteam.incTotalDraws();
			draw = true;
		}
		else{
			winner = awayteam;
			loser = hometeam;
			hometeam.addGoals(homegoals);
			hometeam.addGoalsAgainst(awaygoals);
			awayteam.addGoalsAgainst(homegoals);
			awayteam.addGoals(awaygoals);
			awayteam.addPoints(3);
			hometeam.incTotalLosses();
			awayteam.incTotalWins();
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
	 */
	public void setawaygoals(int goals){
		awaygoals = goals;
	}
	
	/**
	 * 
	 */
	public void setWinner(Team team){
		winner = team;
	}
	
	/**
	 * 
	 */
	public void setLoser(Team team){
		loser = team;
	}
	
	/**
	 * 
	 */
	public void setHomegoals(int goals){
		homegoals = goals;
	}
	
	/**
	 * 
	 * @return
	 */
	public Team getHomeTeam(){
			return hometeam;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean getDraw(){
			return draw;
	}
	
	/**
	 * 
	 * @return
	 */
	public Team getAwayTeam(){
		return awayteam;
	}
	
	public boolean equals(Object other) {
		if (other instanceof Match & (other != null)) {
			Match that = (Match) other;
			if(this.winner != null & this.loser != null & that.winner != null & that.loser != null  ) {
				if (this.hometeam.equals(that.hometeam) &
					this.awayteam.equals(that.awayteam) & 
					this.awaygoals == that.awaygoals &
					this.homegoals == that.homegoals &
					this.loser == that.loser &
					this.winner == that.winner){
				return true;
				}
			}
			else if(this.winner == null & that.winner == null &
					this.hometeam.equals(that.hometeam) &
					this.awayteam.equals(that.awayteam) & 
					this.awaygoals == that.awaygoals &
					this.homegoals == that.homegoals){
				return true;
			}
		}
		return false;
	}
}
