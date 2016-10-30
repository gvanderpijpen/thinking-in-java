package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.util.Arrays;
import java.util.Random;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the initialization of Object filled arrays<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ArrayClassObj {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		print("length of a = " + a.length);
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(500);  //autoboxing
		}
		print(Arrays.toString(a));
	}

}
