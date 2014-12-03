package nl.joshuaslik.UFMReckoning.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main Class of the GUI. This one will be called when the application starts
 * @author Sander Benoist
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws IOException {
    	Parent root = FXMLLoader.load(Class.class.getResource("/data/gui/mainmenu.fxml"));
        
        Scene scene = new Scene(root, 1600, 900);
    
        stage.setTitle("UFM Reckoning");
        stage.setScene(scene);
        stage.show();
    }
}