package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the foreach loop on a String<br>
 * The different characters of the String are printed 1 by 1<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ForEachString {

	public static void main(String[] args) {
		for(char c : "An African Swallow".toCharArray()){
			printnb(c);
		}
	}

}
