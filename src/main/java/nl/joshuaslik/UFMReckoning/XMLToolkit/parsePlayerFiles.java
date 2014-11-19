package nl.joshuaslik.UFMReckoning.XMLToolkit;

import java.io.IOException;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import nl.joshuaslik.UFMReckoning.App;

/**
 *
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class parsePlayerFiles {
	
	public static void parse() throws IOException {
		SAXParser.parse("players/adamsarota.xml");
		String[] files = filesIn("players");
		for(int i = 0; i < files.length; i++) 
			SAXParser.parse(files[i]);
		for(int i = 0; i < files.length; i++) 
			System.out.println(files[i]);
		System.out.println(files.length);
	}
	
	public static String[] filesIn(String folderpath) throws IOException {
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
	
	public static String[] filesInZip(String folderpath) throws IOException {
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