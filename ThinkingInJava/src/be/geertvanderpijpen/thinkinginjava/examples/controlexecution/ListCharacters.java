package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the use of the for loop<br>
 * List all characters by use of a for loop<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ListCharacters {

	public static void main(String[] args) {
		for(char c = 0; c < 128; c++){
			if(Character.isLowerCase(c))
				print("Value : " + (int)c + " character: " + c);
		}

	}

}
