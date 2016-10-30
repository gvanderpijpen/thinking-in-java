package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows the use of arrays with primitive values<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ArraysOfPrimitives {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2;
		a2 = a1;
		for(int i = 0; i < a2.length; i++){
			a2[i] = a2[i] + 1; 
		}
		for(int i = 0; i < a1.length; i++){
			print("a1[" + i + "] = " + a1[i]);
		}
	}

}
