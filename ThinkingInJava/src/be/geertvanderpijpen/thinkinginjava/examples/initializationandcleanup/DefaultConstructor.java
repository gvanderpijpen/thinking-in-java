package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;


class Bird{}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the default constructors in Java<br>
 * Shows that a class that has no constructors, has a default constructor that is injected by Java<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class DefaultConstructor {

	public static void main(String[] args) {
		Bird b = new Bird(); // Default!
	}

}
