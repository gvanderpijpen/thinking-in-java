package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


class OverloadedConstructorInstance{
	OverloadedConstructorInstance(){
		print("OverloadedConstructorInstance()");
	}
	
	OverloadedConstructorInstance(String s){
		print(s + ": OverloadedConstructorInstance()");
	}
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * A class is created that contains a default constructor<br>
 * The default constructor contains a print statement<br>
 * The constructor is overloaded with a String argument<br>
 * Both constructors are called with the print statements proving that they are really used<br>
 * A new instance of the class is created. The printed statement proves that the default constructor is called<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class OverloadedConstructor {

	public static void main(String[] args) {
		new OverloadedConstructorInstance();
		new OverloadedConstructorInstance("With string intialization");
	}

}
