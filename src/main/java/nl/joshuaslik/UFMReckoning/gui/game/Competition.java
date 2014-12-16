package nl.joshuaslik.UFMReckoning.gui.game;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import nl.joshuaslik.UFMReckoning.gui.Main;

/**
 * @author Naomi de Ridder
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class Competition {

	public static void start() {
		Text t = new Text(90,130, "Games Played:");
		t.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
		VBox root = new VBox();
		root.getChildren().addAll(t);
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}

}
