package nl.joshuaslik.UFMReckoning;

import java.io.IOException;

import nl.joshuaslik.UFMReckoning.XMLToolkit.parsePlayerFiles;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Hello World!");
		System.out.println("One day, this will be a cool Footbal Manager!");
		parsePlayerFiles.parse();
		
	}
	
}