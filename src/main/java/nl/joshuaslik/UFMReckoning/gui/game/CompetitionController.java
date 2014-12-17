package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class CompetitionController {
	
	@SuppressWarnings("unused")
	@FXML
	protected void handleGames(ActionEvent event) throws IOException {
		Games.start();
	}

	@SuppressWarnings("unused")
	@FXML
	protected void handleRanking(ActionEvent event) throws IOException {
		Ranking.start();
	}

	@SuppressWarnings("unused")
	@FXML
	protected void handleShowNextGame(ActionEvent event) throws IOException {
		ShowNextGame.start();
	}

}
