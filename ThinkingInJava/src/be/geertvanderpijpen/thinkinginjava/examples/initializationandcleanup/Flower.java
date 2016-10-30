package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates that constructors can be called with the this shortcut<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Flower {
	
	int petalCount = 0;
	String s = "initial value";
	
	Flower(int petals){
		petalCount = petals;
		print("Constructor w/ int arg only. petalCount = " + petalCount);
	}
	
	Flower(String ss){
		print("Constructor w/ String arg only. s = " + ss);
		s = ss;
	}
	
	Flower(String s, int petals){
		this(petals);
//		this(s); Can't call 2!
		
		this.s = s; // Another use of this
		print("String & int args");
	}
	
	Flower(){
		this("hi", 47);
		print("Default constructor (no args)");
	}
	
	void printPetalCount(){
//		this(11); Not inside non-constructor!
		print("petalCount = " + petalCount + ", s = " + s);
	}
		

	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
		

	}

}
