package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Initialize a class member with a method return value<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class MethodInit {
	int i = f();
	int f(){
		return 11;
	}
}
