package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates that for method overloading, a different order in parameters is enough to distinguish 2 methods<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class OverloadingOrder {

	static void f(String s, int i){
		print("String: " + s + ", int: " + i);
	}
	
	static void f(int i, String s){
		print("int: " + i + ", String: " + s);
	}
	public static void main(String[] args) {
		OverloadingOrder.f("String first", 11);
		OverloadingOrder.f(99, "Int first");
	}

}
