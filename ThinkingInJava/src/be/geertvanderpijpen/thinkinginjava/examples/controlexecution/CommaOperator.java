package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the comma operator in a for loop<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class CommaOperator {

	public static void main(String[] args) {
		for(int i = 1, j = i; i < 5; i++, j = i * 2){
			print("i = " + i + ", j = " + j);
		}

	}

}
