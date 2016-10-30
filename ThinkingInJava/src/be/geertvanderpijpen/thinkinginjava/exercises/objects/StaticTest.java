package be.geertvanderpijpen.thinkinginjava.exercises.objects;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * This class is a dummy class to include a static integer field.<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class StaticTest {
	/**
	 * Integer static member field that is initialized to the value 47
	 */
	public static int i=47;
	
	/**
	 * 
	 * Prints the current value of {@link StaticTest#i}
	 */
	public static void printValue(){
		System.out.println("The current value of i is " + StaticTest.i);
	}

}
