package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition
 * Shows the impact of associated type information with literals<br>
 * Hexadecimal, octal, long, float and double type indicators are used<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Literals {

	public static void main(String[] args) {
		int i1 = 0x2f; // Hexadecimal (lowercase)
		print("i1: " + Integer.toBinaryString(i1));
		int i2 = 0X2F; // Hexadecimal (uppercase)
		print("i2: " + Integer.toBinaryString(i2));
		int i3 = 0177; // Octal (leading zero)
		print("i3: " + Integer.toBinaryString(i3));
		char c = 0xfff; // Max char hex value
		print("c: " + Integer.toBinaryString(c));
		byte b = 0x7f; // Max byte hex value
		print("b: " + Integer.toBinaryString(b));
		short s = 0x7fff; // Max short hex value;
		print("s: " + Integer.toBinaryString(s));
		long n1 = 200L; // Long suffix
		long n2 = 200l; // Long suffix (but can be confusing)
		long n3 = 200;
		float f1 = 1; 
		float f2 = 1F; // Float suffix
		float f3 = 1f; // Float suffix
		double d1 = 1d; // Double suffix
		double d2 = 1D; // Double suffix
		// ( Hex and Octal also work with long)
		

	}

}
