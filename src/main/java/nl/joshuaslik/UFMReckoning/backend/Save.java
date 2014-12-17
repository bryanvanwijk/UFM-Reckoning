package nl.joshuaslik.UFMReckoning.backend;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import nl.joshuaslik.UFMReckoning.util.xml.SAXParser;
import nl.joshuaslik.UFMReckoning.util.xml.XMLFile;

/**
 * @author Bryan van Wijk
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class Save {
	
	public static void loadTeam(){
		String current = System.getProperty("user.dir");
		File folder = new File(current + "/src/main/resources/data/base/teams/");
		File[] listofFiles = folder.listFiles();
		XMLFile file = SAXParser.parseFile("/data/base/teams/" + listofFiles[0].getName());
		System.out.println(file);
	}
	
	public static ArrayList<Player> loadplayers(){
		String current = System.getProperty("user.dir");
		File folder = new File(current + "/src/main/resources/data/base/players/");
		File[] listofFiles = folder.listFiles();
		ArrayList<Player> players = new ArrayList<Player>();
		for (int i = 0; i < listofFiles.length; i++){
			if (listofFiles[i].isFile()){
				XMLFile file = SAXParser.parseFile("/data/base/players/" + listofFiles[i].getName());
				String id =  file.getElement("PLAYER").getAttribute("id");
				String last = file.getElement("PLAYER.NAME").getAttribute("last");
				String first = file.getElement("PLAYER.NAME").getAttribute("first");
				String country = file.getContent("PLAYER.COUNTRY");
				String type = file.getContent("PLAYER.TYPE");
				String pos =  file.getContent("PLAYER.POS");
				int price = Integer.parseInt(file.getContent("PLAYER.TPRICE"));
				String team = file.getContent("PLAYER.TEAM");
				if (type.equals("GK")){
					int DIV = Integer.parseInt(file.getElement("PLAYER.STATS").getContent("DIV"));
					int POS =  Integer.parseInt(file.getElement("PLAYER.STATS").getContent("POS"));
					int REF =  Integer.parseInt(file.getElement("PLAYER.STATS").getContent("REF"));
					players.add(new Goalkeeper(id, first, last, country, REF, DIV, POS, price ));
	
				} else {
					int ATT = Integer.parseInt(file.getElement("PLAYER.STATS").getContent("ATT"));
					int DEF =  Integer.parseInt(file.getElement("PLAYER.STATS").getContent("DEF"));
					int STA =  Integer.parseInt(file.getElement("PLAYER.STATS").getContent("STA"));
					players.add(new Fieldplayer(id, first, last, country, pos, ATT, DEF, STA, price));
				}
			}
		}
		return players;
		
	}

}
