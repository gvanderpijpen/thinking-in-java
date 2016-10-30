package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.util.Arrays;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Initialization of Object filled arrays in 2 ways:<br>
 * <ul>
 * <li> using the new keyword only on the left side</li>
 * <li> using the new keyword on both sides</li>
 * </ul>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ArrayInit {

	public static void main(String[] args) {
		Integer[] a = {
				new Integer(1),
				new Integer(2),
				3 // Autoboxing
		};
		
		Integer[] b = new Integer[]{
				new Integer(1),
				new Integer(2),
				3 // Autoboxing
		};
		
		print(Arrays.toString(a));
		print(Arrays.toString(b));

	}

}
