package be.geertvanderpijpen.thinkinginjava.examples.operators;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates casting of values, both implicit as explicit and both narrowing as widening<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Casting {
	
	public static void main(String[] args){
		int i = 200;
		long lng = (long)i;
		lng =  i; // "Widening" so cast not really required
		long lng2 = (long)200;
		lng2 = 200;
		i = (int) lng2; // Cast required
	}

}
