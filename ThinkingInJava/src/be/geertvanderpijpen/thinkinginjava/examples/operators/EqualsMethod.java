package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows how to compare the values of 2 objects: by using the {@link Object#equals(Object)} method<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class EqualsMethod {

	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		
		print(n1.equals(n2));

	}

}
