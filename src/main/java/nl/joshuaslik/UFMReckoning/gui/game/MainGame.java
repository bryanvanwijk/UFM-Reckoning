package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import nl.joshuaslik.UFMReckoning.backend.Game;
import nl.joshuaslik.UFMReckoning.gui.Main;
import nl.joshuaslik.UFMReckoning.gui.MainMenu;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class MainGame {
	
	public static Game game = null;

	public static void start() throws IOException {
//		StackPane root = new StackPane();
		Parent root = FXMLLoader.load(Class.class
				.getResource("/data/gui/MainGame.fxml"));
		Scene scene = new Scene(root, 1080, 1920);
		Main.setScene(scene);
		Main.stage.setFullScreen(true);
	}

	public static void optionbar(Pane root) {
		Button btn = null;
		btn = new Button();
		btn.setText("Team");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Team");
			}
		});
		root.getChildren().add(btn);

		btn = new Button();
		btn.setText("Competition");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Competition.start();
			}
		});
		root.getChildren().add(btn);

		btn = new Button();
		btn.setText("Save");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Save");
			}
		});
		root.getChildren().add(btn);

		btn = new Button();
		btn.setText("Quit");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					MainMenu.start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
			}
		});
		root.getChildren().add(btn);
	}
	
	public static void setGame(Game game) {
		MainGame.game = game;
	}

}

