package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows that varargs lists work with autoboxing (converting Box types to their primitive types)<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class AutoboxingVarargs {
	
	static void f(Integer... args){
		for(Integer i : args){
			printnb(i + " ");
		}
		print();
	}

	/**
	 * @param args the arguments 
	 */
	public static void main(String[] args) {
		f(new Integer(1), new Integer(2));
		f(4, 5, 6, 7, 8, 9);
		f(10, new Integer(11), 12);
	}

}
