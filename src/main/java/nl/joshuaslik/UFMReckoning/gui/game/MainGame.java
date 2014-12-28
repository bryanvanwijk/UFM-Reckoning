package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import nl.joshuaslik.UFMReckoning.backend.Game;
import nl.joshuaslik.UFMReckoning.gui.Main;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class MainGame {

	public static Game game = null;

	public static void start() throws IOException {
		System.out.println("I HAVE A GAME OBJECT!");
		System.out.println("USERNAME: " + game.getUser().getUserName());
		System.out.println("MY TEAM NAME: "
				+ game.getUser().getTeam().getTeamName());
		System.out.println("COACH NAME OF MY TEAM: "
				+ game.getUser().getTeam().getCoachName());
		
		TeamBuilderControl.start(game);
		
	}

	public static void setGame(Game game) {
		System.out.println("GAME OBJECT SET!");
		MainGame.game = game;
	}
	
	public static void initialize() {
		MainGame.game.getCompetition().definePlayrounds();
	}

}
