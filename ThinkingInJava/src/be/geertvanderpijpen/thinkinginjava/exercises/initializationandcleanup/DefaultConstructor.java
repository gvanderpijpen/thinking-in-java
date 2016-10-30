package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


class DefaultConstructorInstance{
	DefaultConstructorInstance(){
		print("DefaultConstructorInstance()");
	}
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * A class is created that contains a default constructor<br>
 * The default constructor contains a print statement<br>
 * A new instance of the class is created. The printed statement proves that the default constructor is called<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class DefaultConstructor {

	public static void main(String[] args) {
		new DefaultConstructorInstance();
	}

}
