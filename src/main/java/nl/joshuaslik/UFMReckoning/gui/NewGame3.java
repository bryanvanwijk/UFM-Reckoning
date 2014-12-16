package nl.joshuaslik.UFMReckoning.gui;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import nl.joshuaslik.UFMReckoning.backend.Player;
import nl.joshuaslik.UFMReckoning.backend.Save;

public class NewGame3 {
	private static TableView<Player> playertable;

	public static void init() {
		playertable = new TableView<Player>();
		playertable.getColumns().addAll(getColumn(playertable));
		playertable.setItems(getPlayerlist());
		
		playertable.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount() > 0) {
					if (playertable.getSelectionModel().getSelectedIndex() >= 1) {
						System.out.println(playertable.getSelectionModel().getSelectedItem().getID());
					}
				}
			}
		});
	}

	public static void start() {
		init();
		VBox root = new VBox();
		root.getChildren().addAll(playertable);

		Scene scene = new Scene(root, 1600, 900);
		Main.setScene(scene);
	}

	public static ArrayList<TableColumn<Player, ?>> getColumn(
			TableView playertable) {
		int i;

		ArrayList<TableColumn<Player, ?>> columns = new ArrayList<TableColumn<Player, ?>>();

		String[] columnNames = { "Full Name", "Country", "Price" };
		String[] variableNames = { "name", "country", "price" };
		Integer[] column_width = { 33, 33, 33 };

		i = 0;
		TableColumn<Player, String> firstnameco1 = new TableColumn<>(columnNames[i++]);
		TableColumn<Player, String> lastnameco1 = new TableColumn<>(columnNames[i++]);
		TableColumn<Player, Integer> priceco1 = new TableColumn<>(columnNames[i++]);

		i = 0;
		firstnameco1.prefWidthProperty().bind(playertable.widthProperty().divide(100 / column_width[i++]));
		lastnameco1.prefWidthProperty().bind(playertable.widthProperty().divide(100 / column_width[i++]));
		priceco1.prefWidthProperty().bind(playertable.widthProperty().divide(100 / column_width[i++]));

		i = 0;
		firstnameco1.setCellValueFactory(new PropertyValueFactory<Player, String>(variableNames[i++]));
		lastnameco1.setCellValueFactory(new PropertyValueFactory<Player, String>(variableNames[i++]));
		priceco1.setCellValueFactory(new PropertyValueFactory<Player, Integer>(variableNames[i++]));

		columns.add(firstnameco1);
		columns.add(lastnameco1);
		columns.add(priceco1);

		return columns;
	}
	
	public static ObservableList<Player> getPlayerlist() {
		ObservableList<Player> data = FXCollections.observableArrayList(Save.loadplayersArrayList());
		return data;
	}
}
