package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows how to use a varargs list to implement optional arguments<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class OptionalTrailingArguments {
	
	static void f(int required, String... trailing){
		printnb("Required : " + required + " ");
		for(String s : trailing){
			printnb(s + " ");
		}
		print();
	}

	public static void main(String[] args) {
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}

}
