package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates that method calls within the same class can be done with or without the use of this, as long as the methods are not static<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class MethodCalls {

	public void method1(){
		print("method 1");
		method2();
		this.method2();
	}
	
	public void method2(){
		print("method 2");
	}
	
	public static void main(String[] args) {
		MethodCalls mc = new MethodCalls();
		mc.method1();

	}

}
