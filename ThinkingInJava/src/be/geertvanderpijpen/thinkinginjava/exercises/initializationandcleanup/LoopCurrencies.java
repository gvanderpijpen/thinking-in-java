package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Loops all the currencies defined in {@link PaperCurrencies} and prints their ordinality<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class LoopCurrencies {

	public static void main(String[] args) {
		for(PaperCurrencies c : PaperCurrencies.values()){
			print("PaperCurrency " + c + ", ordinality " + c.ordinal() );
		}
	}

}
