package nl.joshuaslik.UFMReckoning.gui;

import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import nl.joshuaslik.UFMReckoning.backend.Game;
import nl.joshuaslik.UFMReckoning.backend.Save;
import nl.joshuaslik.UFMReckoning.backend.Team;
import nl.joshuaslik.UFMReckoning.gui.game.MainGame;

public class NewGame2 {
	private static TableView<Team> teamtable;

	public static void init() {
		teamtable = new TableView<Team>();
		teamtable.getColumns().addAll(getColumn(teamtable));
		teamtable.setItems(getTeamlist());

		teamtable.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						if (event.getClickCount() > 0) {
							if (teamtable.getSelectionModel().getSelectedIndex() >= 0) {
								teamtable.getSelectionModel().getSelectedItem();
							}
						}
					}
				});
	}

	public static void start(String username) {
		init();

		//Pane pane = new Pane();
		//Background background = new Background(0)
		//pane.setBackground(background);
		Text t = new Text(400, 300, "Choose your team");
		t.setFont(Font.font("Maiandra GD", FontWeight.BOLD, 60));
		Text t2 = new Text(400, 300, " ");
		t2.setFont(Font.font("Maiandra GD", FontWeight.BOLD, 60));
		Button but = new Button("Choose this team");
		but.setPrefHeight(100);
		but.setPrefWidth(600);
		
		but.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				if (teamtable.getSelectionModel().getSelectedIndex() >= 0) {
					Team chosenTeam = teamtable.getSelectionModel().getSelectedItem();
					Game Game1 = Save.newGame(chosenTeam, username);
					MainGame.setGame(Game1);
					MainGame.initialize();
					try {
						MainGame.start();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		//return button
		Button btn_Return = new Button("Return");
		btn_Return.setPrefHeight(100);
		btn_Return.setPrefWidth(400);
		btn_Return.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				t.setText("Loading...");
				NewGame.start();
			}
		});

		VBox root = new VBox();
		root.getChildren().addAll(t, t2, teamtable, but, btn_Return);

		Scene scene = new Scene(root, 1080, 1920);
		scene.getStylesheets().add("/data/GUI/pages-menu/NewGame2.css");
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}

	public static ArrayList<TableColumn<Team, ?>> getColumn(
			TableView<Team> teamtable) {
		int i;

		ArrayList<TableColumn<Team, ?>> columns = new ArrayList<TableColumn<Team, ?>>();

		String[] columnNames = { "Team", "Average Attack", "Average Defence",
				"Average Stamina", "Player total", "Team value" };
		String[] variableNames = { "teamName", "averageAttackPower", "averageDefencePower",
				"averageStamina", "", "teamValue" };
		Integer[] column_width = { 25, 11, 11, 11, 20, 20 };		
		
		i = 0;
		TableColumn<Team, String> teamname = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> attack = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> defence = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> stamina = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> players = new TableColumn<>(columnNames[i++]);
		TableColumn<Team, Integer> teamvalue = new TableColumn<>(
				columnNames[i++]);

		i = 0;
		teamname.prefWidthProperty().bind(
				teamtable.widthProperty().divide(100 / column_width[i++]));
		attack.prefWidthProperty().bind(
				teamtable.widthProperty().divide(100 / column_width[i++]));
		defence.prefWidthProperty().bind(
				teamtable.widthProperty().divide(100 / column_width[i++]));
		stamina.prefWidthProperty().bind(
				teamtable.widthProperty().divide(100 / column_width[i++]));
		players.prefWidthProperty().bind(
				teamtable.widthProperty().divide(100 / column_width[i++]));
		teamvalue.prefWidthProperty().bind(
				teamtable.widthProperty().divide(100 / column_width[i++]));

		i = 0;
		teamname.setCellValueFactory(new PropertyValueFactory<Team, String>(
				variableNames[i++]));
		attack.setCellValueFactory(new PropertyValueFactory<Team, Integer>(
				variableNames[i++]));
		defence.setCellValueFactory(new PropertyValueFactory<Team, Integer>(
				variableNames[i++]));
		stamina.setCellValueFactory(new PropertyValueFactory<Team, Integer>(
				variableNames[i++]));
		players.setCellValueFactory(new PropertyValueFactory<Team, Integer>(
				variableNames[i++]));
		teamvalue.setCellValueFactory(new PropertyValueFactory<Team, Integer>(
				variableNames[i++]));

		columns.add(teamname);
		columns.add(attack);
		columns.add(defence);
		columns.add(stamina);
		columns.add(players);
		columns.add(teamvalue);

		return columns;
	}

	public static ObservableList<Team> getTeamlist() {
		ObservableList<Team> data = FXCollections.observableArrayList(Save
				.loadTeams());
		return data;
	}
}