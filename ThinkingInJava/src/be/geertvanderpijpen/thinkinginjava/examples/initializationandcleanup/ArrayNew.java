package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the initilazation of primitive value arrays using the new keyword<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ArrayNew {

	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		print("length of a = " + a.length);
		print(Arrays.toString(a));
	}

}
