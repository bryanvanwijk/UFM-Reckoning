package nl.joshuaslik.UFMReckoning.backend;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.junit.Test;

public class SaveTest {
	
	@Test
	public void testSave() throws IOException {
		LinkedHashMap<String, Team> teams = Save.loadTeam();
		/**
		 * 

		for(String key : teams.keySet()){
			System.out.println(teams.get(key).getDefencePower()+"--"+ teams.get(key).getAttackPower()+"--"+teams.get(key).getStamina());
		}
		
		for(String key : teams.keySet()){
			System.out.println(teams.get(key).getTeamName() + "--"+teams.get(key).getActivePlayers().size()+"--"+ teams.get(key).getBenchPlayers().size()+"--");
		}
		
				for(int j = 0; j< game.getCompetition().getPlayrounds().size(); j++){
			for(int i=0; i < game.getCompetition().getPlayrounds().get(j).getMatches().size(); i++){
				System.out.println(game.getCompetition().getPlayrounds().get(j).getMatches().get(i).getHomeTeam().getTeamName()+"-"+game.getCompetition().getPlayrounds().get(j).getMatches().get(i).getAwayTeam().getTeamName());
			}
			System.out.println("");
		}
		
		Game game = Save.newGame(teams.get("ado-den-haag"), "bryan");
		game.getCompetition().DefinePlayrounds();
		game.getCompetition().computeresultCompetition();
		game.getCompetition().ComputeStandings();
		for(int i = 0; i<game.getUsers().size(); i++){
			System.out.println(game.getUsers().get(i).getTeam().getTeamName()+"-"+game.getUsers().get(i).getTeam().getRanking());
		}
		*/
		Game game = Save.newGame(teams.get("ado-den-haag"), "bryan");
		Save.SaveGame(game);
	}
	
}

