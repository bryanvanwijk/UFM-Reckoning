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
		DefinePlayrounds();
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
	private void DefinePlayrounds(){
		ArrayList<Match> matches = new ArrayList<Match>();
		for (int i = 0; i < users.size(); i++){
			for (int j = 0; j < users.size(); j++){
				if (users.get(i) != users.get(j)){
					matches.add(new Match(users.get(i).getTeam(), users.get(j).getTeam()));
				}
			}
		}
		Collections.shuffle(matches);
		Playround newplayround = new Playround();
		
		for (int i = 0; i < matches.size(); i++){
			if (newplayround.getMatches().size() != (users.size()/2)){
				playrounds.add(newplayround);
				newplayround = new Playround();
			}
			if (matches.get(i).get)
			newplayround.addmatch(matches.get(i));
		}
		
	}
	
	public void getPlayrounds(){
		
	}
}
