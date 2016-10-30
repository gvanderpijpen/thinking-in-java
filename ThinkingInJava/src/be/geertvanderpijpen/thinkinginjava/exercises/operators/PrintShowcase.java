package be.geertvanderpijpen.thinkinginjava.exercises.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.util.Date;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Showcase class for the {@link be.geertvanderpijpen.thinkinginjava.utils.Print#print(Object)} method <br>
 * Prints a String with {@link be.geertvanderpijpen.thinkinginjava.utils.Print#print(Object)} and then with System.out.println(Object) 
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class PrintShowcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print("This is a string with the print method");
		System.out.println("This is a string with the traditional System.out.prntln method");
		
		print("Today is " + new Date());
		System.out.println("Today is " + new Date());

	}

}
