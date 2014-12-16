package nl.joshuaslik.UFMReckoning.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NewGame {

	public static void start() {		

		Text t = new Text(400, 300, "Enter your name");
		t.setFont(Font.font("Maiandra", FontWeight.BOLD, 60));
		//Label lab = new Label("Enter your name");
		Button but = new Button("Continue");

		but.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				//lab.setText("Loading...");
			}
		});

		VBox root = new VBox();
		root.getChildren().addAll(t, but);

		Scene scene = new Scene(root, 1920, 1080);
		Main.setScene(scene);
	}

	public static void PickUserName() {
		String Username;
	}
}