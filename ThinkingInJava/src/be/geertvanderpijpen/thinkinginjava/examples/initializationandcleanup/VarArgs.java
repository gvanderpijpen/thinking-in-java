package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class A{}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Using array syntax to create a variable arguments list<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class VarArgs {
	static void printArray(Object[] args){
		for(Object obj : args){
			printnb(obj + " ");
		}
		print();
	}

	public static void main(String[] args) {
		printArray(new Object[] {
				new Integer(47), new Float(3.14), new Double(11.11)
		});
		
		printArray(new Object[] {
				"one", "two", "three"
		});
		
		printArray(new Object[] {
				new A(), new A(), new A()
		});
		
	}

}
