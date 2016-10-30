package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * Demonstrates operators on Strings in Java, in particular the + and += operators<br>
 * Part of Thinking in Java, 4th edition
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class StringOperators {

	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		print(s + x + y + z);
		print(x + " " + s); // Converts x to a String
		s += " summed = "; // Concatenation operator
		print(s + (x + y + z));
		print("" + x); // Shorthand for Integer.toString()
		
	}

}
