package nl.joshuaslik.UFMReckoning.gui.game;

import java.io.IOException;

import nl.joshuaslik.UFMReckoning.backend.Game;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class MainGame {

	public static Game game = null;

	public static void start() throws IOException {
		TeamBuilder.start();
	}

	public static void setGame(Game game) {
		MainGame.game = game;
	}

}
