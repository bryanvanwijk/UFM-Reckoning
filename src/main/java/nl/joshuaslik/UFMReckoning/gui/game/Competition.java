package nl.joshuaslik.UFMReckoning.gui.game;

import java.awt.Font;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

import javax.xml.soap.Text;

import nl.joshuaslik.UFMReckoning.gui.Main;

/**
 * @author Naomi de Ridder
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class Competition {

	public static void start() throws IOException {
		Parent root = FXMLLoader.load(Class.class
				.getResource("/data/gui/Competition.fxml"));
		Text t = new Text(90,130, "Games Played:");
		t.setFont(Font.font("Verdana", Fontweight.BOLD, 60));
		VBox root = new VBox();
		root.getChildren().addAll(t, but);
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}

}
