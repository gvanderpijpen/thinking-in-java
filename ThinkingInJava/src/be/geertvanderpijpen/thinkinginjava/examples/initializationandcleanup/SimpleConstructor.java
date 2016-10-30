package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Rock{
	Rock(){ // This is the constructor
		printnb("Rock ");
	}
}


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the use of a constructor by creation Rock objects and printing the constructor messages
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class SimpleConstructor {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			new Rock();
		}
	}

}
