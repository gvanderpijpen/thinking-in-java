package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition
 * @author Geert Vanderpijpen
 * @version 1.0
 * Represents a window based on a marker variable
 */
class Window {
	
	/**
	 * 
	 * @param marker The marker (ID) of the window
	 */
	Window(int marker){
		print("Window(" + marker + ")");
	}
}


/**
 * 
 * Part of Thinking in Java, 4th edition
 * @author Geert Vanderpijpen
 * @version 1.0
 * Represents a House that contains a {@link Window}
 */
class House {
	Window w1 = new Window(1); // Before constructor
	
	House(){
		// Show that we're in the constructor
		print("House()");
		w3 = new Window(33); // Re-initialize in the constrcutor
	}
	
	Window w2 = new Window(2); // After constructor
	
	void f(){
		print("f()");
	}
	
	Window w3 = new Window(3); // At end 		
}

/**
 * 
 * Part of Thinking in Java, 4th edition
 * @author Geert Vanderpijpen
 * @version 1.0
 * Demonstrates the order of initialization in a class<br>
 * All variables are initialized before any method call (including the constructor)<br>
 * An {@link House} is instanced. Due to the print statements in the {@link Window} constructor<br>
 * the order of initialization of variables becomes visible<br>
 */
public class OrderOfInitialization {
	
	public static void main(String[] args){
		House h = new House();
		h.f();  // Show that the constrcutor is done
	}

}
