package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * About contains and updates information about the project. 
 * 
 * @author Anthony Nguyen
 * @author Tyke Sykes
 * @version May 5, 2020 
 *
 */
public class About {

	/**	 Authors of the project	 */
	private static String[] authors = {"Darryl James", "Andrew Lim",
									   "Tyke Sykes", "Anthony Nguyen"};
	
	/**
	 * Run this to update the current version of the project. 
	 * @param args Command Line Arguments (not utilized) 
	 */
	public static void main(String[] args) {
		updateVersion();
	}
	
	/**
	 * Updates the version file to contain the current date. 
	 */
	public static void updateVersion() {
		String updateDate = LocalDate.now().toString();
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("files/version.txt", "UTF-8");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println(updateDate);
		writer.close();
		System.out.println(updateDate);
	}
	
	/**
	 * Reads the version file and returns the last date the project was updated. 
	 * @return current version of project
	 */
	public static String getVersion() {
		Scanner file = null;
		try {
			file = new Scanner(new File("files/version.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String version = file.nextLine();
		file.close();
		return version;
	}
	
	/**
	 * Returns the authors of the project. 
	 * @return authors of project 
	 */
	public static String[] getAuthors() {
		return authors;
	}
		
}
