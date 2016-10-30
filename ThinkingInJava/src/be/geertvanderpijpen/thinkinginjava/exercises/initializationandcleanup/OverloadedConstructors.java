package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Overload constructors and call one constructor from the other using this<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class OverloadedConstructors {

	OverloadedConstructors(){
		this(18);
		print("Default constructor with no arguments");		
	}
	OverloadedConstructors(int i){
		print("int constructor with value " + i);
	}
	public static void main(String[] args) {
		new OverloadedConstructors();
	}

}
