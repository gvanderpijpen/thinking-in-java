package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Tree{
	int height;
	
	Tree(){
		print("Planting a seedling");
		height = 0;
	}
	
	Tree(int initialHeight){
		height = initialHeight;
		print("Creating a new Tree that is " + initialHeight + " feet tall");
	}
	
	void info(){
		print("Tree is " + height + " feet tall");
	}
	
	void info(String s){
		print(s + ": Tree is " + height + " feet tall");
	}
}


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates overloaded constructors and methods in general<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Overloading {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++){
			Tree t = new Tree(i);
			t.info();
			t.info("Overloaded method");
		}
		
		// Overloaded constructor
		new Tree();

	}

}
