package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Dog class that contains different overloaded bark methods<br>
 * The print statements show what method is used<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Dog {
	
	void bark(int i){
		print("bark(int)");
	}
	
	void bark(float f){
		print("bark(float)");
	}
	
	void bark(int i, float f){
		print("bark(int, float)");
	}
	
	void bark(float f, int i){
		print("bark(float, int)");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.bark(1);
		d1.bark(1.0f);
		d1.bark(1,1.0f);
		d1.bark(1.0f, 1);

	}

}
