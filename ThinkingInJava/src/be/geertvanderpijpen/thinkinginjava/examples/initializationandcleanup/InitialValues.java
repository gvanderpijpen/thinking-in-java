package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows that primitive member fields of a class get default initial values if not explicitely specified<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class InitialValues {

	boolean t; 
	char c;
	byte b; 
	short s; 
	int i; 
	long l;
	float f;
	double d;
	InitialValues reference;
	
	void printInitialValues(){
		print("Data type           Initial value");
		print("boolean             " + t);
		print("char                " + c);
		print("byte                " + b);
		print("short               " + s);
		print("int                 " + i);
		print("long                " + l);
		print("float               " + f);
		print("double              " + d);
		print("reference           " + reference);
		
	}
	
	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
		/* You could als say : 
		 * new InitialValues().printInitialValues();
		 */
		

	}

}
