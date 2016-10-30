package be.geertvanderpijpen.thinkinginjava.exercises.objects;

import java.util.Date;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Displays a String and today's date<br>
 * Javadoc even accepts HTML lists:<br>
 * <ul>
 * <li> Item 1 </li>
 * <li> Item 2 </li>
 * </ul>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class HelloDate {

	/**
	 * Entry point to class and application
	 * @param args array of String arguments 
	 */
	public static void main(String[] args) {
		System.out.println("Hello, it's : ");
		System.out.println(new Date());
	}

}
