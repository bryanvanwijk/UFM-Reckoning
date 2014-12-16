package nl.joshuaslik.UFMReckoning.gui.game;

import nl.joshuaslik.UFMReckoning.gui.Main;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ShowNextGame {

	public static void start() {
		Text t = new Text(90,130, "Next Game:");
		t.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
		VBox root = new VBox();
		root.getChildren().addAll(t);
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}
	// show the next game to be played. Competition -> Next game to be played. 
}
