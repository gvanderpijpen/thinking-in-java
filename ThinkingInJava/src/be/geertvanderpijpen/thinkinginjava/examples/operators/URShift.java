package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Test of unsigned right shift<br>
 * Shows why unsigned right shift assignment in combination with short or byte is dangerous<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class URShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -1;
		print(Integer.toBinaryString(i));
		i >>>= 10;
		print(Integer.toBinaryString(i));
		long l = -1;
		print(Long.toBinaryString(l));
		l >>>= 10;
		print(Long.toBinaryString(l));
		short s = -1;
		print(Integer.toBinaryString(s));
		s >>>= 10;
		print(Integer.toBinaryString(s));
		byte b = -1;
		print(Integer.toBinaryString(b));
		b >>>= 10;
		print(Integer.toBinaryString(b));
		b =  -1;
		print(Integer.toBinaryString(b));
		print(Integer.toBinaryString(b >>> 10));
		

	}

}
