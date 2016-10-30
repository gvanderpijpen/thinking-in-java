package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * Shows that values are truncated during cast from float or double to integer
 * Part of Thinking in Java, 4th edition
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class CastingNumbers {

	public static void main(String[] args) {
		double above=0.7, below=0.4;
		float fabove=0.7f, fbelow=0.4f;
		print("(int) above: " + (int)above);
		print("(int) below: " + (int)below);
		print("(int) fabove: " + (int)fabove);
		print("(int) fbelow: " + (int)fbelow);
		
	}

}
