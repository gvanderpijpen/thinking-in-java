package be.geertvanderpijpen.thinkinginjava.exercises.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Prints the maximum and mimimum values of double and float data types in exponential notation
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ExponentialExtremes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doubleMinimum = Double.MIN_VALUE;
		double doubleMaximum = Double.MAX_VALUE;
		print("Minimal double value : " + doubleMinimum);
		print("Maximal double value : " + doubleMaximum);
		
		float floatMinimum = Float.MIN_VALUE;
		float floatMaximum = Float.MAX_VALUE;
		print("Minimal float value : " + floatMinimum);
		print("Maximal float value : " + floatMaximum);

	}

}
