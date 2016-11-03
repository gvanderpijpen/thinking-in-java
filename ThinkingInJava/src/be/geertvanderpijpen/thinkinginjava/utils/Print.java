package be.geertvanderpijpen.thinkinginjava.utils;

import java.io.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Print methods that can be used without qualifiers, using Java SE5 static imports
 * The print methods are mainly wrappers around existing Java print tools.
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Print {
	
	/**
	 * Print object with newline
	 * @param obj The object to be printed
	 */
	public static void print (Object obj){
		System.out.println(obj);
	}
	
	/** 
	 * Print newline
	 */
	public static void print(){
		System.out.println();
	}
	
	/**
	 * Print object without newline
	 * @param obj Object to be printed
	 */
	public static void printnb(Object obj){
		System.out.print(obj);
	}
	
	
	/**
	 * 
	 * Return {@link java.io.PrintStream} object to support formatted output
	 * @param format Format to be used for the returned {@link java.io.PrintStream} object
	 * @param args Objects to be printed in formatted form
	 * @return {@link java.io.PrintStream} for formatted output
	 */
	public static PrintStream printf(String format, Object... args){
		return System.out.printf(format, args);
	}
	
}
