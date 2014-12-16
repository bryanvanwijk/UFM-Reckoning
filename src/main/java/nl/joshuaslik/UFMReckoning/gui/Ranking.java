package nl.joshuaslik.UFMReckoning.gui;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Ranking {

	public static void start() {
		Text t = new Text(90,130, "Ranking:");
		t.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
		VBox root = new VBox();
		root.getChildren().addAll(t);
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}
}
