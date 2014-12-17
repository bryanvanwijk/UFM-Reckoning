package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import nl.joshuaslik.UFMReckoning.gui.Main;

/**5
 * @author Naomi de Ridder
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class Competition {


	public static void start() throws IOException {
		Parent root = FXMLLoader.load(Class.class
				.getResource("/data/gui/pages-game/Competition.fxml"));
		Scene scene = new Scene(root, 1080, 1920);
		Main.stage.setScene(scene);
		Main.stage.setFullScreen(true);
	}
	
	/*When pushing this button a new game has to start. In page shownextgame!!
	 * 
	 * @FXML
	protected void handlePlayNextRound(ActionEvent event) throws IOException {
		System.out.println("btn_PlayNextRound pressed");
		System.out.println(event.getSource());
		PlayNextRound.start();
	}*/
}
