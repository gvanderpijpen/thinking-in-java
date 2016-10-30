package be.geertvanderpijpen.thinkinginjava.exercises.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows bitwise operators on values with alternating bits<br>
 * Both values have alternating 1 and 0 bits, with
 * <ul>
 * <li>One value with 1 as least-significant bit</li>
 * <li>One value with 0 as least-significant bit</li>
 * </ul>
 * The binary operators are AND, OR, XOR and NOT<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class AlternatingBits {

	public static void main(String[] args) {
		int value1 = 0x155;
		int value2 = 0xAA;
		
		print("value1: " + Integer.toBinaryString(value1));
		print("value2: " + Integer.toBinaryString(value2));
		
		print("(value1 | value2): " + Integer.toBinaryString((value1 | value2)));
		print("(value1 & value2): " + Integer.toBinaryString((value1 & value2)));
		print("(value1 ^ value2): " + Integer.toBinaryString((value1 ^ value2)));
		print("~value1: " + Integer.toBinaryString(~value1));
		
	}

}
