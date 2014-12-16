package nl.joshuaslik.UFMReckoning.gui;

import java.util.ArrayList;

import nl.joshuaslik.UFMReckoning.backend.Player;
import nl.joshuaslik.UFMReckoning.backend.Save;
import nl.joshuaslik.UFMReckoning.backend.Team;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NewGame2 extends Application {
	TableView<Player> teamtable;

	public static void main(String[] args) {
		launch(args);
		
		//Save.loadTeam();
		//System.out.println(Save.loadTeam());
	}

	@Override
	public void init() {
		teamtable = new TableView<Player>();
	}

	@Override
	public void start(Stage stage) throws Exception {
		//Label lab = new Label("Choose your team");
		Text t = new Text(400, 300, "Choose your team");
		t.setFont(Font.font("Maiandra", FontWeight.BOLD, 60));

		VBox root = new VBox();
		root.getChildren().addAll(t);

		Scene scene = new Scene(root, 1600, 900);
		stage.setScene(scene);

		stage.setTitle("UFM Reckoning");
		stage.show();
	}
}