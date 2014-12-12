package nl.joshuaslik.UFMReckoning.gui;

import java.awt.Insets;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
		stage.initStyle(StageStyle.UNDECORATED);
		stage.setWidth(1920);
		stage.setHeight(1080);
		stage.setFullScreen(true);
		stage.setTitle("Ultimate Football Manager");
		
		Main.stage = stage;
		
		Scene scene = new Scene(root, 1080, 1920);
		
		Main.stage.setScene(scene);
		Main.stage.show();
	}
	
	public static void showNewGame() throws IOException{
		Parent root = FXMLLoader.load(Class.class.getResource("/data/gui/NewGame.fxml"));
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
	}
	
	public FlowPane addFlowPane() {
	    FlowPane flow = new FlowPane();
	    flow.setVgap(4);
	    flow.setHgap(4);
	    flow.setPrefWrapLength(170); 
	    flow.setStyle("-fx-background-color: DAE6F3;");

	    return flow;
	}
}