package be.geertvanderpijpen.thinkinginjava.exercises.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Determines for differenat test values and ranges if the test value is in the specified range<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class InRange {
	
	private static boolean test(int testval, int min, int max){
		return (testval >= min && testval <= max) ? true : false;
	}

	public static void main(String[] args) {
		print(test(3, 0, 5));
		print(test(5, 0, 5));
		print(test(6, 0, 5));
		print(test(-3, 0, 5));
	}

}
