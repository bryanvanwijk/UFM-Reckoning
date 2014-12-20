package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import nl.joshuaslik.UFMReckoning.backend.Game;
import nl.joshuaslik.UFMReckoning.backend.Match;
import nl.joshuaslik.UFMReckoning.backend.Playround;
import nl.joshuaslik.UFMReckoning.backend.Save;
import nl.joshuaslik.UFMReckoning.backend.Team;
import nl.joshuaslik.UFMReckoning.gui.Main;

public class Playrounds {

	private static Match selectedmatch;

	@FXML
    private TableView<Match> competitiontable;
    @FXML
    private TableColumn<Match, String> playround;
    @FXML
    private TableColumn<Match, String> home;
    @FXML
    private TableColumn<Match, String> away;
    @FXML
    private TableColumn<Match, String> homegoals;
    @FXML
    private TableColumn<Match, String> awaygoals;
    
    @FXML
    private void initialize() {
    	
    	ObservableList<Match> matches = FXCollections.observableArrayList(getMatchList());
    	competitiontable.setItems(matches);
    	
    	playround.setCellValueFactory(new PropertyValueFactory<Match, String>(
				"playround"));
		home.setCellValueFactory(new PropertyValueFactory<Match, String>(
				"hometeam"));
		away.setCellValueFactory(new PropertyValueFactory<Match, String>(
				"awayteam"));
		homegoals.setCellValueFactory(new PropertyValueFactory<Match, String>(
				"homegoals"));
		awaygoals.setCellValueFactory(new PropertyValueFactory<Match, String>(
				"awaygoals"));
	
        // Listen for selection changes 
		competitiontable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> selectedMatch(newValue));
		
		competitiontable.getSortOrder().add(playround);
        playround.setSortable(true);
       
        competitiontable.setRowFactory(new Callback<TableView<Match>, TableRow<Match>>() {
            @Override public TableRow<Match> call(TableView<Match> param) {
                return new TableRow<Match>() {
                    @Override protected void updateItem(Match item, boolean empty) {
                        super.updateItem(item, empty);
                        if (getItem() != null && getItem().contains(MainGame.game.getUser().getTeam())) {
                            getStyleClass().add("highlightedRow");
                        } else {
                            getStyleClass().remove("highlightedRow");
                        }
                    }
                };
            }
        });

    }
    

    public Integer getgoals(int goals){
    	if(goals != -1){
    		return goals;
    	}
    	else{
    		return null;
    	}
    }
	public void selectedMatch(Match newValue) {
		selectedmatch = newValue;
	}


	public static void start() throws IOException {
		AnchorPane topmenu = (AnchorPane) FXMLLoader.load(Class.class.getResource("/data/gui/pages-menu/TopMenu.fxml"));
		Label label = (Label) topmenu.lookup("#title");
		label.setText("Playrounds");
		Main.setTop(topmenu);
		AnchorPane scene = (AnchorPane) FXMLLoader.load(Class.class.getResource("/data/gui/pages-game/Playrounds.fxml"));
		Main.setCenter(scene);
		AnchorPane bottom = (AnchorPane) FXMLLoader.load(Class.class.getResource("/data/gui/pages-game/GameBottomMenuBar.fxml"));
		Main.setBottom(bottom);
	}
	
	
	
	@FXML
	protected void handlenNextround(ActionEvent event) throws IOException {
		System.out.println(MainGame.game.currentround);
    	MainGame.game.resultplayround();
    	Playrounds.start();
	}


	public static ObservableList<Match> getMatchList() {
		ArrayList<Playround> pr = MainGame.game.getCompetition()
				.getPlayrounds();
		ArrayList<Match> matches = new ArrayList<Match>();
		for (int i = 0; i < pr.size(); i++)
			matches.addAll(pr.get(i).getMatches());
		

		ObservableList<Match> data = FXCollections.observableArrayList(matches);
		return data;
	}

}