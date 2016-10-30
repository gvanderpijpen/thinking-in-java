package be.geertvanderpijpen.thinkinginjava.exercises.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows that hexadecimal and octal type indicators also work with long variables<br>
 * 2 long values are declared and given a value with 
 * <ul>
 * <li>hexadecimal value using the 0x type indicator</li>
 * <li>Octal value using the leading zero type indicator</li>
 * </ul>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class LongLiterals {

	public static void main(String[] args) {
		long n1 = 0xBC851E;
		print("n1: " + Long.toBinaryString(n1));
		long n2 = 057102436;
		print("n2: " + Long.toBinaryString(n2));
		
	}

}
