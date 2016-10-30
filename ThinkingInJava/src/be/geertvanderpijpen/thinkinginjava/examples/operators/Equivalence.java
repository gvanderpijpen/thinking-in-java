package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;



/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the fact that Object equivalence is reference-based rather then value-based<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Equivalence {

	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		
		print(n1 == n2);
		print(n1 != n2);
		

	}

}
