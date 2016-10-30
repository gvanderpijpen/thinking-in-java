package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;


/** 
 * 
 * Part of Thinking in Java, 4th edition<br>
 * INitialize class member fields with method return values<br>
 * Forward references (using a member field that is not initialized yet to initialize another member field) is not allowed
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class MethodInit3 {
	// int j = g(i); Illegal forward reference
	int i = f();
	int f(){
		return 11;
	}
	int g(int n){
		return n * 10;
	}

}
