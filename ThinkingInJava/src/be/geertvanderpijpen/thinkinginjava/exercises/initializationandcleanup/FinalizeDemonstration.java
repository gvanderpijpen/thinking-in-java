package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class FinalizeObject{
	
	protected void finalize(){
		print("Object is cleaned up");
	}
	
}


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the cleanup of Java objects<br>
 * Note that the garbage collector does not seem to clean up the one created object<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class FinalizeDemonstration {

	public static void main(String[] args) {
		FinalizeObject fin = new FinalizeObject();
		
		System.gc();

	}

}
