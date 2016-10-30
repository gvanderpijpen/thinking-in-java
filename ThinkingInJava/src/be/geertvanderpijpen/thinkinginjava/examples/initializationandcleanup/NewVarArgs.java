package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Pass arguments to a method using a variable argument list without using the array syntax
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class NewVarArgs {
	
	static void printArray(Object... args){
		for(Object obj : args){
			printnb(obj + " ");
		}
		print();
	}

	public static void main(String[] args) {
		// Can take individual elements:
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		
		// Or array: 
		printArray((Object[])new Integer[] {1, 2, 3, 4});
		printArray(); // Empty list is OK
	}

}
