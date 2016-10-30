package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Initializes a String array and prints all elements<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ArrayOfStrings {

	public static void main(String[] args) {
		String[] a1 = new String[] {
				"string 1",
				"string 2",
				"string 3",
				"string 4"
		};
		
		for(String s : a1){
			print(s);
		}
		
	}

}
