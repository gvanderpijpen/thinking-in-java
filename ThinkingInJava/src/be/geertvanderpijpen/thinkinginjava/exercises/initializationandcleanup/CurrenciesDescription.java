package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Lists the {@link PaperCurrencies} enumerator values by color<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class CurrenciesDescription {
	
	static void describeCurrency(PaperCurrencies p){
		printnb(p + " has a ");
		switch (p){
		case FIVE_EURO: 
		case TWENTY_EURO: 		printnb("blue");
								break;
		case TEN_EURO:			printnb("red");
								break;
		case FIFTY_EURO:		printnb("orange");
								break;
		case HUNDRED_EURO:		printnb("green");
								break;
		case TWO_HUNDRED_EURO: 	printnb("yellow");
								break;
	    default:				printnb("unknown");
			 
			
		}
		
		print(" color");
	}

	public static void main(String[] args) {
		for(PaperCurrencies c : PaperCurrencies.values()){
			describeCurrency(c);
		}
	}

}
