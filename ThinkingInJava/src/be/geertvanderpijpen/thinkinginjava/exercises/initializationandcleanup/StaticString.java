package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class ExampleString{
	static String example = "Example String";
	static String staticBlock;
	
	static {
		staticBlock = "Initialized at static block";
	}
	
	static void printFields(){
		print("example = " + example);
		print("staticBlock = " + staticBlock);
	}
}


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Uses a class with 2 static String fields <br>
 * One field is initialized at declaration time <br>
 * The other field is initialized during static initialization block<br>
 * Displays show that the fields are initialized before they are accessed the first time<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class StaticString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleString.printFields();
	}

}
