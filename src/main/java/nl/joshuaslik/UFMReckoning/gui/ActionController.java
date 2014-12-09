package nl.joshuaslik.UFMReckoning.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * @author Sander Benoist
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
@SuppressWarnings("restriction")
public class ActionController {

	@FXML
	protected void handleNewGame(ActionEvent event) {
		System.out.println("Handle [New Game] event yo! Do it nao!");
		System.out.println(event.getSource());
	}

	@FXML
	protected void handleLoadGame(ActionEvent event) {
		System.out.println("Handle [Load Game] event yo! Do it nao!");
		System.out.println(event.getSource());
	}

	@FXML
	protected void handleHighscores(ActionEvent event) {
		System.out.println("Handle [Highscore] event yo! Do it nao!");
		System.out.println(event.getSource());
	}

	@FXML
	protected void handleExitGame(ActionEvent event) {
		System.out.println("Handle [Exit Game] event yo! Do it nao!");
		System.out.println(event.getSource());
	}

}
