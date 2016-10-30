package be.geertvanderpijpen.thinkinginjava.exercises.objects;

import be.geertvanderpijpen.thinkinginjava.utils.TIJStringUtils;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the TIJStringUtils class storage function (see {@link be.geertvanderpijpen.thinkinginjava.utils.TIJStringUtils#storage(String)}) <br>
 * A String object is passed to {@link be.geertvanderpijpen.thinkinginjava.utils.TIJStringUtils#storage(String)} method.<br>
 * The result is printed on the screen.
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class DemonstrateTIJStringUtilsStorage {
	public static void main(String [] args){
		System.out.println("The storage space for \"Test string\" is " + TIJStringUtils.storage("Test string"));
		
	}

}
