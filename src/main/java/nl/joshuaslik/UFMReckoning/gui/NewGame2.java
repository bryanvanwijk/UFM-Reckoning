package nl.joshuaslik.UFMReckoning.gui;

import java.util.ArrayList;

import nl.joshuaslik.UFMReckoning.backend.Player;
import nl.joshuaslik.UFMReckoning.backend.Save;
import nl.joshuaslik.UFMReckoning.backend.Team;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NewGame2 extends Application {
	TableView<Team> teamtable;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() {
		teamtable = new TableView<Team>();
		teamtable.getColumns().addAll(getColumn(teamtable));
		teamtable.setItems(getTeamlist());
		
		teamtable.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount() > 1) {
					if (teamtable.getSelectionModel().getSelectedIndex() >= 0) {
						
						//System.out.println(teamtable.getSelectionModel().getSelectedItem().getid());
					}
				}
			}
			
		});
	}
		
	@Override
	public void start(Stage stage) throws Exception {
		//Label lab = new Label("Choose your team");
		Text t = new Text(400, 300, "Choose your team");
		t.setFont(Font.font("Maiandra GD", FontWeight.BOLD, 60));
		Text t2 = new Text(400, 300, " ");
		t2.setFont(Font.font("Maiandra GD", FontWeight.BOLD, 60));

		VBox root = new VBox();
		root.getChildren().addAll(t, t2, teamtable);

		Scene scene = new Scene(root, 1600, 900);
		stage.setScene(scene);

		stage.setTitle("UFM Reckoning");
		stage.setFullScreen(true);
		stage.show();
	}
	
	public static ArrayList<TableColumn<Team, ?>> getColumn(
			TableView teamtable) {
		int i;

		ArrayList<TableColumn<Team, ?>> columns = new ArrayList<TableColumn<Team, ?>>();

		String[] columnNames = { "Team", "Average Attack", "Average Defence", "Average Stamina", "Player total", "Team value" };
		String[] variableNames = { "teamName", "", "", "", "", "" };
		Integer[] column_width = { 25, 11, 11, 11, 20, 20};

		i = 0;
		TableColumn<Team, String> teamname = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> attack = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> defence = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> stamina = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> players = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> teamvalue = new TableColumn<>(columnNames[i++]);

		i = 0;
		teamname.prefWidthProperty().bind(teamtable.widthProperty().divide(100 / column_width[i++]));
		attack.prefWidthProperty().bind(teamtable.widthProperty().divide(100 / column_width[i++]));
		defence.prefWidthProperty().bind(teamtable.widthProperty().divide(100 / column_width[i++]));
		stamina.prefWidthProperty().bind(teamtable.widthProperty().divide(100 / column_width[i++]));
		players.prefWidthProperty().bind(teamtable.widthProperty().divide(100 / column_width[i++]));
		teamvalue.prefWidthProperty().bind(teamtable.widthProperty().divide(100 / column_width[i++]));

		i = 0;
		teamname.setCellValueFactory(new PropertyValueFactory<Team, String>(variableNames[i++]));
		attack.setCellValueFactory(new PropertyValueFactory<Team, Integer>(variableNames[i++]));
		defence.setCellValueFactory(new PropertyValueFactory<Team, Integer>(variableNames[i++]));
		stamina.setCellValueFactory(new PropertyValueFactory<Team, Integer>(variableNames[i++]));
		players.setCellValueFactory(new PropertyValueFactory<Team, Integer>(variableNames[i++]));
		teamvalue.setCellValueFactory(new PropertyValueFactory<Team, Integer>(variableNames[i++]));

		columns.add(teamname);
		columns.add(attack);
		columns.add(defence);
		columns.add(stamina);
		columns.add(players);
		columns.add(teamvalue);

		return columns;
	}
	
	public static ObservableList<Team> getTeamlist() {
		ObservableList<Team> data = FXCollections.observableArrayList(Save.loadTeams());
		return data;
	}
}