package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import nl.joshuaslik.UFMReckoning.gui.Main;
import nl.joshuaslik.UFMReckoning.gui.MainMenu;
import nl.joshuaslik.UFMReckoning.gui.Ranking;
import nl.joshuaslik.UFMReckoning.gui.SeeAllGames;
import nl.joshuaslik.UFMReckoning.gui.ShowNextGame;

/**5
 * @author Naomi de Ridder
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class Competition {

	@SuppressWarnings("restriction")
	public static void start() {
		Text t = new Text(90,130, "Games Played:");
		t.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
		VBox root = new VBox();
		root.getChildren().addAll(t);
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}
	
	@FXML
	protected void handleShowNextGame(ActionEvent event) {
		System.out.println("btn_ShowNextGame pressed");
		System.out.println(event.getSource());
		ShowNextGame.start();
	}
	
	@FXML
	protected void handleRanking(ActionEvent event) {
		System.out.println("btn_Ranking pressed");
		System.out.println(event.getSource());
		Ranking.start();
	}
	
	@FXML
	protected void handleReturnMainMenu(ActionEvent event) throws IOException {
		System.out.println("btn_Return pressed");
		System.out.println(event.getSource());
		MainMenu.start();
	}
	
	@FXML
	protected void handleAllGames(ActionEvent event) throws IOException {
		System.out.println("btn_AllGames pressed");
		System.out.println(event.getSource());
		SeeAllGames.start();
	}
	
	/*When pushing this button a new game has to start. 
	 * 
	 * @FXML
	protected void handlePlayNextRound(ActionEvent event) throws IOException {
		System.out.println("btn_PlayNextRound pressed");
		System.out.println(event.getSource());
		PlayNextRound.start();
	}*/
}
