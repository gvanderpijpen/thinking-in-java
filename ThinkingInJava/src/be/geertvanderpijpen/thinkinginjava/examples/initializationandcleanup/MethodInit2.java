package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;


/** 
 * 
 * Part of Thinking in Java, 4th edition<br>
 * INitialize class member fields with method return values<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class MethodInit2 {
	int i = f();
	int j = g(i);
	int f(){
		return 11;
	}
	int g(int n){
		return n * 10;
	}

}
