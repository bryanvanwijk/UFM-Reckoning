package nl.joshuaslik.UFMReckoning.gui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

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
import javafx.stage.Stage;

public class NewGame3 extends Application {

	TableView<Player> playertable;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() {
		playertable = new TableView<Player>();
		playertable.getColumns().addAll(getColumn(playertable));
		playertable.setItems(getPlayerdummy());
		
		playertable.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount() > 0) {
					if (playertable.getSelectionModel().getSelectedIndex() >= 0) {
						System.out.println(playertable.getSelectionModel().getSelectedItem().getID());
					}
				}
			}
			
		});
	}

	@Override
	public void start(Stage stage) throws Exception {

		VBox root = new VBox();
		root.getChildren().addAll(playertable);

		Scene scene = new Scene(root, 1600, 900);
		stage.setScene(scene);

		stage.setTitle("UFM Reckoning");
		stage.show();
	}

	public static ArrayList<TableColumn<Player, ?>> getColumn(
			TableView playertable) {
		int i;

		ArrayList<TableColumn<Player, ?>> columns = new ArrayList<TableColumn<Player, ?>>();

		String[] columnNames = { "First Name", "Last Name", "Price" };
		String[] variableNames = { "firstName", "lastName", "price" };
		Integer[] column_width = { 33, 33, 33 };

		i = 0;
		TableColumn<Player, String> firstnameco1 = new TableColumn<>(columnNames[i++]);
		TableColumn<Player, String> lastnameco1 = new TableColumn<>(columnNames[i++]);
		//TableColumn<Player, Integer> attco1 = new TableColumn<>(columnNames[i++]);
		//TableColumn<Player, Integer> defco1 = new TableColumn<>(columnNames[i++]);
		//TableColumn<Player, Integer> staminaco1 = new TableColumn<>(columnNames[i++]);
		TableColumn<Player, Integer> priceco1 = new TableColumn<>(columnNames[i++]);

		i = 0;
		firstnameco1.prefWidthProperty().bind(playertable.widthProperty().divide(100 / column_width[i++]));
		lastnameco1.prefWidthProperty().bind(playertable.widthProperty().divide(100 / column_width[i++]));
		//attco1.prefWidthProperty().bind(playertable.widthProperty().divide(100 / column_width[i++]));
		//defco1.prefWidthProperty().bind(playertable.widthProperty().divide(100 / column_width[i++]));
		//staminaco1.prefWidthProperty().bind(playertable.widthProperty().divide(100 / column_width[i++]));
		priceco1.prefWidthProperty().bind(playertable.widthProperty().divide(100 / column_width[i++]));

		i = 0;
		firstnameco1.setCellValueFactory(new PropertyValueFactory<Player, String>(variableNames[i++]));
		lastnameco1.setCellValueFactory(new PropertyValueFactory<Player, String>(variableNames[i++]));
		//attco1.setCellValueFactory(new PropertyValueFactory<Player, Integer>(variableNames[i++]));
		//defco1.setCellValueFactory(new PropertyValueFactory<Player, Integer>(variableNames[i++]));
		//staminaco1.setCellValueFactory(new PropertyValueFactory<Player, Integer>(variableNames[i++]));
		priceco1.setCellValueFactory(new PropertyValueFactory<Player, Integer>(variableNames[i++]));

		columns.add(firstnameco1);
		columns.add(lastnameco1);
		//columns.add(attco1);
		//columns.add(defco1);
		//columns.add(staminaco1);
		columns.add(priceco1);

		return columns;
	}
	
	public static ObservableList<Player> getPlayerdummy() {
		LinkedHashMap<String,Player> playerdata= Save.loadplayers();
		ObservableList<Player> data = FXCollections.observableArrayList(playerdata);
		
		
	
		//List<String> keyList = new ArrayList<String>(playerdata.keySet());
		//List<String> valueList = new ArrayList<Integer>(playerdata.values());
		
		//data.addAll(playerslist.get(key).get(firstName));
		return data;
	}
}
