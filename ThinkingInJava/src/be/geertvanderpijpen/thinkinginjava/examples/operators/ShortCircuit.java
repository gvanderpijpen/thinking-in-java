package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows short circuiting in Java when evaluating boolean expressions<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ShortCircuit {
	
	private static boolean test1(int val){
		print("test1(" + val + ")");
		print("result : " + (val < 1));
		return (val < 1);
	}
	
	private static boolean test2(int val){
		print("test2(" + val + ")");
		print("result : " + (val < 2));
		return (val < 2);
	}
	
	private static boolean test3(int val){
		print("test3(" + val + ")");
		print("result : " + (val < 3));
		return (val < 3);
	}

	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(2);
		print("expression is " + b);

	}

}
