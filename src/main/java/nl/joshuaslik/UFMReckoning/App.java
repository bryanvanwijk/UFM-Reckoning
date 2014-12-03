package nl.joshuaslik.UFMReckoning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import nl.joshuaslik.UFMReckoning.XMLToolkit.NoSuchElementException;
import nl.joshuaslik.UFMReckoning.XMLToolkit.SAXParser;
import nl.joshuaslik.UFMReckoning.XMLToolkit.XMLFile;

import nl.joshuaslik.UFMReckoning.gui.Main;

public class App {
	
	public static void main(String[] args) throws NoSuchElementException {
		
		System.out.println("Hello World!");
		System.out.println("One day, this will be a cool Footbal Manager!");
		System.out.println();
		
		Main.main(args);
		
		// Random tests
		if(args.length > 0) {
			if(args[0].equals("readfiletest")) {
				if(args.length < 2) {
					System.out.println("You need to provide a filename");
				} else {
					InputStream input = Class.class.getResourceAsStream(args[1]);
					InputStreamReader inputReader = null;
					BufferedReader reader = null;
					try {
						inputReader = new InputStreamReader(input);
						reader = new BufferedReader(inputReader);
					} catch (NullPointerException e) {
						System.err.println("That file does not exist");
					}
					if(!(inputReader == null || reader == null)) {
						String line = null;
						try {
							while( (line = reader.readLine()) != null)
								System.out.println(line);
						} catch (IOException | NullPointerException e) {
							System.err.println("That file does not exist");
						}
					}
					
				}
			}
			
			if(args[0].equals("xmlparse")) {
				if(args.length < 2) {
					System.out.println("You need to provide a filename");
				} else {
					XMLFile file = SAXParser.parseFile(args[1]);
					System.out.println(file.toString());
				}
			}
		}
			
	}
	
}