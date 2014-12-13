package nl.joshuaslik.UFMReckoning.backend;

import java.util.ArrayList;

/**
 * @author Bryan van Wijk
 * 
 *
 */
public class Playround {
	
	ArrayList<Match> matches = new ArrayList<Match>();
	
	public Playround(){
		
	}
	
	public void determineResult(){
		for(int i = 0; i < matches.size(); i++){
			matches.get(i).determineResult();
		}
	}
	
	
	public void addmatch(Match match){
		matches.add(match);
	}
	
	public ArrayList<Match> getMatches(){
		return matches;
	}

}
