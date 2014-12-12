package nl.joshuaslik.UFMReckoning.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main Class of the GUI. This one will be called when the application starts
 * 
 * @author Sander Benoist
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
@SuppressWarnings("restriction")
public class Main extends Application {
	public static Stage stage;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(Class.class.getResource("/data/gui/mainmenu.fxml"));
		this.stage = stage;
		Scene scene = new Scene(root, 1680, 1920);

		stage.setTitle("UFM Reckoning");
		stage.setScene(scene);
		stage.setHeight(1680);
		stage.setWidth(1920);
		stage.show();
	}
	
	public static void showNewGame() throws IOException{
		Parent root = FXMLLoader.load(Class.class.getResource("/data/gui/NewGame.fxml"));
		Scene scene = new Scene(root, 1680, 1920);
		stage.setScene(scene);
	}
}