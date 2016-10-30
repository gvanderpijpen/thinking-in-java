package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows the use of exponential notation (10 to the power x) in Java<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Exponents {

	public static void main(String[] args) {
		// Uppercae and lowercase 'e' are the same: 
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;
		print(expFloat);
		double expDouble = 47e47d; //'d' is optional
		double expDouble2 = 47E47; // Automatically done
		print(expDouble);
	}

}
