package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows how to solve some varargs overloading issues
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class OverloadingVarargs3 {
	
	static void f(float i, Character... args){
		print("first");
	}
	
	static void f(char c, Character... args){
		print("second");
	}

	public static void main(String[] args) {
		f(1,'a');	
		f('a','b');
	}

}
