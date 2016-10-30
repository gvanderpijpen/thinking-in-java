package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Person{
	public void eat(Apple apple){
		Apple peeled = apple.getPeeled();
		print("Yummy");
	}
}

class Peeler{
	static Apple peel(Apple apple) {
		// ... remove peel
		return apple; // peeled
	}
}

class Apple{
	Apple getPeeled(){
		return Peeler.peel(this);
	}
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates how the current object can be passed to a method call using the this keyword<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class PassingThis {

	public static void main(String[] args) {
		new Person().eat(new Apple());
	}

}
