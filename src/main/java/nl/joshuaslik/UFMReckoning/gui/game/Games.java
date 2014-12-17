package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import nl.joshuaslik.UFMReckoning.backend.Match;
import nl.joshuaslik.UFMReckoning.backend.Playround;
import nl.joshuaslik.UFMReckoning.gui.Main;

public class Games {

	private static TableView<Match> competitionTable;

	public static void init() {
		competitionTable = new TableView<Match>();
		competitionTable.getColumns().addAll(getColumn(competitionTable));
		competitionTable.setItems(getMatchList());

		competitionTable
				.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						if (event.getClickCount() > 0) {
							if (competitionTable.getSelectionModel()
									.getSelectedIndex() >= 0) {
								competitionTable.getSelectionModel()
										.getSelectedItem();
							}
						}
					}
				});
	}

	public static void start() throws IOException {
		init();
		Pane root = FXMLLoader.load(Class.class
				.getResource("/data/gui/pages-game/Games.fxml"));

		Pane pane = new Pane();
		pane.setPrefSize(1300, 800);
		pane.setLayoutX(600);
		pane.setLayoutY(150);
		competitionTable.setPrefSize(1300, 800);
		pane.getChildren().add(competitionTable);
		root.getChildren().add(pane);
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}

	public static ArrayList<TableColumn<Match, ?>> getColumn(
			TableView<Match> competitionTable) {
		int i;

		ArrayList<TableColumn<Match, ?>> columns = new ArrayList<TableColumn<Match, ?>>();

		String[] columnNames = { "Playround", "Home", "Away", "Result" };
		String[] variableNames = {"playround", "teamname1", "teamname2", "result" };
		Integer[] column_width = { 10, 40, 40, 10};

		i = 0;
		TableColumn<Match, Integer> playround = new TableColumn<>(columnNames[i++]);
		TableColumn<Match, String> teamname1 = new TableColumn<>(
				columnNames[i++]);
		TableColumn<Match, String> teamname2 = new TableColumn<>(
				columnNames[i++]);
		TableColumn<Match, String> result = new TableColumn<>(columnNames[i++]);

		i = 0;
		playround.prefWidthProperty().bind(
				competitionTable.widthProperty()
						.divide(100 / column_width[i++]));
		teamname1.prefWidthProperty().bind(
				competitionTable.widthProperty()
						.divide(100 / column_width[i++]));
		teamname2.prefWidthProperty().bind(
				competitionTable.widthProperty()
						.divide(100 / column_width[i++]));
		result.prefWidthProperty().bind(
				competitionTable.widthProperty()
						.divide(100 / column_width[i++]));

		i = 0;
		playround.setCellValueFactory(new PropertyValueFactory<Match, Integer>(
				variableNames[i++]));
		teamname1.setCellValueFactory(new PropertyValueFactory<Match, String>(
				variableNames[i++]));
		teamname2.setCellValueFactory(new PropertyValueFactory<Match, String>(
				variableNames[i++]));
		result.setCellValueFactory(new PropertyValueFactory<Match, String>(
				variableNames[i++]));

		columns.add(playround);
		columns.add(teamname1);
		columns.add(teamname2);
		columns.add(result);

		return columns;
	}

	public static ObservableList<Match> getMatchList() {
		ArrayList<Playround> pr = MainGame.game.getCompetition()
				.getPlayrounds();
		ArrayList<Match> matches = new ArrayList<Match>();
		for (int i = 0; i < pr.size(); i++)
			matches.addAll(pr.get(i).getMatches());
		
		System.out.println(matches.toString());

		ObservableList<Match> data = FXCollections.observableArrayList(matches);
		return data;
	}

}