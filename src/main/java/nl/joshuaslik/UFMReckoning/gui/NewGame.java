package nl.joshuaslik.UFMReckoning.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class NewGame {
	static String username;

	/*
	 * Start
	 * Text, buttons en textfield + events die bij de scene horen
	 */
	public static void start() {
		Text t = new Text(400, 300, "Enter your name");
		t.setFont(Font.font("Maiandra GD", FontWeight.BOLD, 60));
		Button but = new Button("Submit");
		
		TextField txt = new TextField();
		txt.setMaxWidth(250);
		
		but.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				t.setText("Loading...");
				String user = txt.getText();
				username = user;
			}
		});

		VBox root = new VBox();
		root.getChildren().addAll(t, txt, but);

		Scene scene = new Scene(root, 1920, 1080);
		Main.setScene(scene);
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		NewGame.username = username;
	}
}