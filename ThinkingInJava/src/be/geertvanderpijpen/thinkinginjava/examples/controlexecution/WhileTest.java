package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the while loop<br>
 * A random number is generated until it is greater or equal to 0.99<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class WhileTest {

	static boolean condition(){
		boolean result = Math.random() < 0.99;
		printnb(result + ", ");
		return result;
	}
	public static void main(String[] args) {
		while(condition()){
			print("Inside 'while'");
		}
		print("Exited 'while'");
	}

}
