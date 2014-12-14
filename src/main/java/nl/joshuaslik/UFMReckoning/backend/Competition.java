package nl.joshuaslik.UFMReckoning.backend;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Bryan van Wijk
 * 
 *
 */
public class Competition {
	ArrayList<Playround> playrounds = new ArrayList<Playround>();
	Game game;
	ArrayList<User> users;

	public Competition(Game game){
		this.game = game;
		users  = game.getUsers();
	}
	
	public ArrayList<User> getusers(){
		return users;
	}
	
	public void ComputeStandings(){
		int ranking=1;
		for (int i = 0; i < users.size(); i++){
			ranking = 1;
			for(int j = 0; j < users.size(); j++){
				if((users.get(i).getTeam().getPoints() < users.get(j).getTeam().getPoints()) ||
						( users.get(i).getTeam().getPoints() == users.get(j).getTeam().getPoints() && users.get(i).getTeam().getTotalGoals() < users.get(j).getTeam().getTotalGoals() )){
					ranking = ranking + 1;
				}
			}
			users.get(i).getTeam().setRanking(ranking);
		}
		
	}
	
	/**
	 * add all matches of this competition to random playrounds
	 */
	public void DefinePlayrounds(){
		ArrayList<Match> matches = new ArrayList<Match>();
		for (int i = 0; i < users.size(); i++){
			
			for (int j = 0; j < users.size(); j++){
				if (users.get(i) != users.get(j)){
					matches.add(new Match(users.get(i).getTeam(), users.get(j).getTeam()));
				}
			}
		}
		Collections.shuffle(matches);
		int i =0;
		while(playrounds.size() != (users.size()*(users.size()-1)/(users.size()/2))){
			Playround newplayround = new Playround();
			i = 0;	
			while(newplayround.getMatches().size() != (users.size()/2)){
					if (!(newplayround.contains(matches.get(i).getHomeTeam())) && !(newplayround.contains(matches.get(i).getAwayTeam()))) {
						newplayround.addmatch(matches.get(i));
					}
					i = i+1;
				}
			playrounds.add(newplayround);
		}
		
	}
	
	public void computeresultCompetition(){
		for(int i =0; i<playrounds.size(); i++){
			playrounds.get(i).determineResultPlayround();
		}
	}
	public Playround getPlayround(int i){
		return playrounds.get(i);
	}
	
	public ArrayList<Playround> getPlayrounds(){
		return playrounds;
	}
}
