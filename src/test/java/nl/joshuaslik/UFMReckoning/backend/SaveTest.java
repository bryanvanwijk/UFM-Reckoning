package nl.joshuaslik.UFMReckoning.backend;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
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
		*/
		for(String key : teams.keySet()){
			System.out.println(teams.get(key).getTeamName() + "--"+teams.get(key).getActivePlayers().size()+"--"+ teams.get(key).getBenchPlayers().size()+"--");
		}
	}
	
}

