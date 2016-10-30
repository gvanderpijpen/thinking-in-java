package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Rock2{
	Rock2(int i){
		printnb("Rock " + i + " ");
	}
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates a constructor with arguments<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class SimpleConstructor2 {

	public static void main(String[] args) {
		for(int i = 0; i < 8; i++)
			new Rock2(i);
	}

}
