package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class StringValue{
	private String value;
	StringValue(){
		print(value);
	}
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates that an unitialized String member is initialized to null by Java<br>
 * The String class member is not given an initialization value<br>
 * It's value is then printed in the constructor<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class UninitializedString {

	public static void main(String[] args) {
		new StringValue();

	}

}
