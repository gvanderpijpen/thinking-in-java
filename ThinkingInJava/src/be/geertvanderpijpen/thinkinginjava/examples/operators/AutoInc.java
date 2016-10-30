package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the use of auto increment operators<br>
 * The program demonstrates the difference between postfix and prefix application of the operator<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class AutoInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		print("i : " + i);
		print("++i : " + ++i); //Pre-increment
		print("i++ : " + i++); //Post-increment
		print("i : " + i);
		print("--i : " + --i); //Pre-decrement
		print("i-- : " + i--); //Post-decrement
		print("i : " + i);
		

	}

}
