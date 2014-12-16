package nl.joshuaslik.UFMReckoning.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Main Class of the GUI. This one will be called when the application starts
 * 
 * @author Sander Benoist
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class MainMenu {

	public static void start() throws IOException {
		Parent root = FXMLLoader.load(Class.class.getResource("/data/gui/MainMenu.fxml"));
		Scene scene = new Scene(root, 1080, 1920);
		
		Main.setScene(scene);
		Main.stage().show();
	}
 
	public static void showNewGame() throws IOException{
		Parent root = FXMLLoader.load(Class.class.getResource("/data/gui/NewGame.fxml"));
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}
	
	//Just to test if the competition page is working
	public static void showCompetition() throws IOException{
		Parent root = FXMLLoader.load(Class.class.getResource("/data/gui/Competition.fxml"));
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}
	
}