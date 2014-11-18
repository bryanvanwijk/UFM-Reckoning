package nl.joshuaslik.UFMReckoning;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class App {
	
	public static void main(String[] args) throws IOException {
		SAXParser.parse("players/adamsarota.xml");
		String[] files = filesInAlt("players");
		for(int i = 0; i < files.length; i++) 
			SAXParser.parse(files[i]);
		for(int i = 0; i < files.length; i++) 
			System.out.println(files[i]);
		System.out.println(files.length);
	}
	
	public static File[] filesIn(String folderpath) {
		File folder = new File(folderpath);
		File[] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println("File " + listOfFiles[i].getName());
		    }
		}
		
		return listOfFiles;
	}
	
	public static String[] filesInAlt(String folderpath) throws IOException {
		CodeSource src = App.class.getProtectionDomain().getCodeSource();
		List<String> list = new ArrayList<String>();

		if( src != null ) {
		    URL jar = src.getLocation();
		    ZipInputStream zip = new ZipInputStream( jar.openStream());
		    ZipEntry ze = null;

		    while( ( ze = zip.getNextEntry() ) != null ) {
		        String entryName = ze.getName();
		        if( entryName.startsWith("players") && entryName.endsWith(".xml") ) {
		            list.add( entryName  );
		        }
		    }

		 }
		 return list.toArray( new String[ list.size() ] );
	}
	
}