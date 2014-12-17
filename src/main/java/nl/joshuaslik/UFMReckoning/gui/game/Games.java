package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import nl.joshuaslik.UFMReckoning.backend.Match;
import nl.joshuaslik.UFMReckoning.backend.Playround;
import nl.joshuaslik.UFMReckoning.backend.Save;
import nl.joshuaslik.UFMReckoning.backend.Team;
import nl.joshuaslik.UFMReckoning.gui.Main;

public class Games {

	public static void start() throws IOException {
		Parent root = FXMLLoader.load(Class.class
				.getResource("/data/gui/pages-game/Games.fxml"));
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}
	
	private static TableView<Match> competitionTable;

	public static void init() {
		competitionTable = new TableView<Match>();
		competitionTable.getColumns().addAll(getColumn(competitionTable));
		competitionTable.setItems(getTeamlist());

		competitionTable.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						if (event.getClickCount() > 0) {
							if (competitionTable.getSelectionModel().getSelectedIndex() >= 0) {
								competitionTable.getSelectionModel().getSelectedItem();
							}
						}
					}
				});
	}

	
	public static ArrayList<TableColumn<Match, String>> getColumn(
			TableView<Match> competitionTable) {
		int i;

		ArrayList<TableColumn<Match, String>> columns = new ArrayList<TableColumn<Match, String>>();

		String[] columnNames = { "Home", "Away", "Result"};
		String[] variableNames = { "teamname1","teamname2", "result"};
		Integer[] column_width = { 40, 40, 5};

		i = 0;
		TableColumn<Match, String> teamname1 = new TableColumn<>(columnNames[i++]);
		TableColumn<Match, String> teamname2 = new TableColumn<>(columnNames[i++]);
		TableColumn<Match, String> result = new TableColumn<>(columnNames[i++]);
		
		i = 0;
		teamname1.prefWidthProperty().bind(
				competitionTable.widthProperty().divide(100 / column_width[i++]));
		teamname2.prefWidthProperty().bind(
				competitionTable.widthProperty().divide(100 / column_width[i++]));
		result.prefWidthProperty().bind(
				competitionTable.widthProperty().divide(100 / column_width[i++]));
		

		i = 0;
		teamname1.setCellValueFactory(new PropertyValueFactory<Match, String>(
				variableNames[i++]));
		teamname2.setCellValueFactory(new PropertyValueFactory<Match, String>(
				variableNames[i++]));
		result.setCellValueFactory(new PropertyValueFactory<Match, String>(
				variableNames[i++]));
		
		columns.add(teamname1);
		columns.add(teamname2);
		columns.add(result);

		return columns;
	}

	public static ObservableList<Match> getTeamlist() {
		ArrayList<Playround> pr = MainGame.game.getCompetition().getPlayrounds();
		ArrayList<Match> matches = new ArrayList<Match>();
		for(int i = 0; i < pr.size(); i++)
			matches.addAll(pr.get(i).getMatches());

		ObservableList<Match> data = FXCollections.observableArrayList(matches);
		return data;
	}

}