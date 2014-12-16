package nl.joshuaslik.UFMReckoning.gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * @author Sander Benoist
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class ActionController {

	@FXML
	protected void handleStartGame(ActionEvent event) throws IOException {
		System.out.println("Handle [Start game] event yo! Do it nao!");
		System.out.println(event.getSource());
		MainMenu.showNewGame();
	}

	@FXML
	protected void handleOptions(ActionEvent event) throws IOException {
		System.out.println("Handle [Options] event yo! Do it nao!");
		System.out.println(event.getSource());
		MainMenu.showCompetition();
	}

	@FXML
	protected void handleHighscores(ActionEvent event) {
		System.out.println("Handle [Highscore] event yo! Do it nao!");
		
		System.out.println(event.getSource());
	}

	@FXML
	protected void handleQuitGame(ActionEvent event) {
		System.out.println("Handle [Quit Game] event yo! Do it nao!");
		System.out.println(event.getSource());
		System.exit(0);
	}

}
