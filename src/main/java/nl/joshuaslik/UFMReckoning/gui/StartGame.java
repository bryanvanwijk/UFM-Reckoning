package nl.joshuaslik.UFMReckoning.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * @author Bryan van Wijk
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class StartGame {

	public static void start() throws IOException {
		Parent root = FXMLLoader.load(Class.class
				.getResource("/data/gui/NewGame.fxml"));
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}

}
