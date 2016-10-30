package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates that one method can call another method in the same class without using the this keyword<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Apricot {

	void pick(){}
	void pit(){
		pick();
	}

}
