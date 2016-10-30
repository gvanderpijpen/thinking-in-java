package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows that vararg lists can be treated as arrays.<br>
 * If nothing is in the varargs list, it is an array with size 0<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class VarargType {
	
	static void f(Character... args){
		printnb(args.getClass());
		print(" length " + args.length);
	}
	
	static void g(int... args){
		printnb(args.getClass());
		print(" length " + args.length);
	}

	public static void main(String[] args) {
		f('a');
		f();
		g(1);
		g();
		print("int[] : " + new int[0].getClass());
	}

}
