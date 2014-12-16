package nl.joshuaslik.UFMReckoning.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class Main extends Application {

	public static Stage stage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setWidth(1920);
		primaryStage.setHeight(1080);
		primaryStage.setFullScreen(true);
		primaryStage.setTitle("Ultimate Football Manager");
		primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
		stage = primaryStage;
		MainMenu.start();
	}

	public FlowPane addFlowPane() {
		FlowPane flow = new FlowPane();
		flow.setVgap(4);
		flow.setHgap(4);
		flow.setPrefWrapLength(170);
		flow.setStyle("-fx-background-color: DAE6F3;");

		return flow;
	}

	public static void setScene(Scene scn) {
		stage.setScene(scn);
	}

	public static Stage stage() {
		return stage;
	}

}
