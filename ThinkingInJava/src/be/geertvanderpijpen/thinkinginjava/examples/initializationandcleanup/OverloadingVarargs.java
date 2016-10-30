package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows that varargs complicate overloading.<br>
 * varargs lists can be empty, resulting in a possible ambiguity<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class OverloadingVarargs {
	
	static void f(Character... args){
		printnb("first");
		for(Character c : args){
			printnb(" " + c);
		}
		
		print();
	}
	
	static void f(Integer... args){
		printnb("second");
		for(Integer i : args){
			printnb(" " + i);
		}
		print();
	}
	
	static void f(Long... args){
		print("third");
	}

	public static void main(String[] args) {
		f('a', 'b', 'c');
		f(1);
		f(2, 1);
		f(0);
		f(0L);
// The following line provokes a ambiguity compile time error
//		f();
	}

}
