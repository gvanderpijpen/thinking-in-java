package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class InitStringValue{
	private String value = "initial value";
	private String value2;
	InitStringValue(){
		print(value);
		print(value2);
		value2 = "initialized in the constructor";
		print(value);
		print(value2);
	}
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates that a class member that is initialized at definition time gets the correct value<br>
 * A String class member is initialized at definition time. The value is then printed in the contructor<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class InitializedStringValue {

	public static void main(String[] args) {
		new InitStringValue();

	}

}
