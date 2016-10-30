package be.geertvanderpijpen.thinkinginjava.utils;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Contains several String utils defined in the Thinking in Java books<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class TIJStringUtils {
	/**
	 * 
	 * @param s A String
	 * @return The number of bytes (storage) taken by the input parameter
	 */
	public static int storage (String s){
		return s.length() * 2;
	}

}
