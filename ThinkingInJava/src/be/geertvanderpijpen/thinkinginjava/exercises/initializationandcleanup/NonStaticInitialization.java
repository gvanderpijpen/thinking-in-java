package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class StringHolder{
	String memberString;
	{
		memberString = "This member String is initialized in non-static initialization block";
		print("memberString is initialized");
	}
	
	StringHolder(){
		print("StringHolder()");
	}
}


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates non-static initialization using a class with a String member field<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class NonStaticInitialization {

	public static void main(String[] args) {
		print("inside main()");
		new StringHolder();
		print("new StringHolder() completed");
	}

}
