package nl.joshuaslik.UFMReckoning.XMLToolkit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class XMLFile {

	XMLTag root;

	/**
	 * Constructor
	 * 
	 * @param root
	 * 				root tag of this file
	 */
	public XMLFile(XMLTag root) {
		this.root = root;
	}

	/**
	 * 
	 * @param name
	 * 				is the name of the element to get
	 * @return
	 * 				the content of the element at location <b>name</b>
	 * @throws NoSuchElementException
	 *				is thrown if element is not found
	 */
	public String getContent(String name) throws NoSuchElementException {
		return root.getContent(name);
	}
	
	/**
	 * 
	 * @param name
	 * 				is the name of the element to get
	 * @return
	 * 				the element at the location <b>name</b>
	 * @throws NoSuchElementException
	 * 				is thrown if element is not found
	 */
	public XMLTag getElement(String name) throws NoSuchElementException {
		return root.getElement(name);
	}
	
	/**
	 * This method is depreciated. Please use {@link XMLTag#getAttribute(String)} until functionality has been added.
	 * 
	 * This method will get the attribute of an element in this XMLFile.
	 * It expects that you specify where to find the attribute like so:
	 * roottag.child1.child2.targetelement.attributeX
	 * @param name
	 * 				is the name of the attribute to get
	 * @return
	 * 				the attribute from element <b>name</b>
	 * @deprecated
	 */
	public String getAttribute(String name) {
		String retstr = null;
		return retstr;
	}
	
	/**
	 * 
	 * @param location
	 * 				the location to save this XMLFile
	 */
	public void save(String location) {
		String retstr = root.toString();
		String encoding = "UTF-8";
		File target = new File(location);
		makeDirs(location);
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(target, encoding);
		} catch (FileNotFoundException e) {
			System.err.println("[ERROR] The file \"" + target + "\" was not found!");
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.err.println("[ERROR] The encoding \"" + encoding + "\" is not supported!");
			e.printStackTrace();
		}
		writer.write(retstr);
		writer.flush();
	}
	
	/**
	 * @return
	 * 				a string representation of this object.
	 */
	public String toString() {
		return root.toString();
	}
	
	public void makeDirs(String location) {
		File target = new File(location);
		String here = new File("").getAbsolutePath();
		String apath = target.getAbsolutePath();
		apath = apath.replace("\\", "/");
		apath = apath.substring(here.length() + 1);
		apath = apath.substring(0, apath.lastIndexOf('/'));
		File file = new File(apath);
		System.out.println(file.getAbsolutePath());
		file.mkdirs();
	}

}
