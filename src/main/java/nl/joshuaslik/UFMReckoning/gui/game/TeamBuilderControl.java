package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import nl.joshuaslik.UFMReckoning.backend.Game;
import nl.joshuaslik.UFMReckoning.backend.Player;
import nl.joshuaslik.UFMReckoning.backend.Save;
import nl.joshuaslik.UFMReckoning.backend.Team;
import nl.joshuaslik.UFMReckoning.gui.Main;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class TeamBuilderControl {

	private Player selectedplayer;
	private static Team team;
	private ObservableList<Player> players;
	
 	@FXML
    private TableView<Player> playertable;
 	
    @FXML
    private TableColumn<Player, String> fullname;
    
    @FXML
    private TableColumn<Player, String> country;
    
    @FXML
    private Label playerlabel;
    @FXML
    private Label teamname;
    @FXML
    private TableColumn<Player, String> price;

    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	teamname.setText(team.getTeamName());
    	ArrayList<Player> playerslist = team.getActivePlayers();
    	players = FXCollections.observableArrayList(playerslist);
    	playertable.setItems(players);
    	
    	fullname.setCellValueFactory(new PropertyValueFactory<Player, String>(
				"position"));
		country.setCellValueFactory(new PropertyValueFactory<Player, String>(
				"country"));
		price.setCellValueFactory(new PropertyValueFactory<Player, String>(
				"price"));
    
        // Listen for selection changes 
		playertable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> selectedPlayer(newValue));
    }
    
    
    
    public void selectedPlayer(Player player){
    	selectedplayer = player;
    	playerlabel.setText(selectedplayer.getfullName());
    }
    
    public static void start(Game game) throws IOException {
    	team = game.getUser().getTeam();
    	AnchorPane topmenu = (AnchorPane) FXMLLoader.load(Class.class.getResource("/data/gui/pages-menu/TopMenu.fxml"));
		Label label = (Label) topmenu.lookup("#title");
		label.setText("MainGamemenu");
		Main.setTop(topmenu);
		AnchorPane scene = (AnchorPane) FXMLLoader.load(Class.class.getResource("/data/gui/pages-game/TeamBuilder.fxml"));
		Main.setCenter(scene);
		AnchorPane bottom = (AnchorPane) FXMLLoader.load(Class.class.getResource("/data/gui/pages-game/GameBottomMenuBar.fxml"));
		Main.setBottom(bottom);
	}


}
