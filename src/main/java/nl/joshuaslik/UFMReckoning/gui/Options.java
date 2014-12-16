package nl.joshuaslik.UFMReckoning.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * @author Sander Benoist
 *
 */
public class Options {

	public static void start() throws IOException {
		Parent root = FXMLLoader.load(Class.class
				.getResource("/data/gui/Options.fxml"));
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}

}
