package nl.joshuaslik.UFMReckoning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import nl.joshuaslik.UFMReckoning.XMLToolkit.SAXParser;
import nl.joshuaslik.UFMReckoning.XMLToolkit.XMLFile;
import nl.joshuaslik.UFMReckoning.gui.Main;

/**
 * 
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class App {

	public static void main(String[] args) {

		System.out.println("Ultimate Football Manager");
		System.out.println("(c) 2014 - Sander Benoist, Naomi de Ridder, Joshua Slik, Lisette Veldkamp, Bryan van Wijk");

		// Random tests
		if (args.length > 0) {
			if (args[0].equals("readfiletest")) {
				if (args.length < 2) {
					System.err.println("You need to provide a filename");
				} else {
					InputStream input = Class.class
							.getResourceAsStream(args[1]);
					InputStreamReader inputReader = new InputStreamReader(input);
					BufferedReader reader = new BufferedReader(inputReader);
					
					String line = null;
					try {
						while ((line = reader.readLine()) != null)
							System.out.println(line);
						reader.close();
					} catch (IOException e) {
						System.err.println("Error reading or closing BufferedReader");
					}
					
				}
			}

			if (args[0].equals("xmlparse")) {
				if (args.length < 2) {
					System.err.println("You need to provide a filename");
				} else {
					XMLFile file = SAXParser.parseFile(args[1]);
					System.out.println(file.toString());
				}
			}

			if (args[0].equals("xmlsave")) {
				if (args.length < 3) {
					System.err.println("You need to provide two filenames");
				} else {
					XMLFile file = SAXParser.parseFile(args[1]);
					file.save(args[2]);
				}
			}
		} else {
			Main.main(args);
		}

	}

}