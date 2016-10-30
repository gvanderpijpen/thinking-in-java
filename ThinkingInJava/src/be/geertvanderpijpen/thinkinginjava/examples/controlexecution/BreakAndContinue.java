package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;
import static be.geertvanderpijpen.thinkinginjava.utils.Range.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates break and continue keywords<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class BreakAndContinue {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if(i == 74)
				break; // Out of for loop
			if(i % 9 != 0)
				continue; // Next iteration
			printnb(i + " ");
		}
		print();
		
		// Using foreach
		for(int i : range(100)){
			if(i == 74)
				break; // Out of for loop
			if(i % 9 != 0)
				continue; // Next iteration
			printnb(i + " ");
		}
		print();
		
		// An "infinite" while loop
		int i = 0; 
		while(true){
			i++;
			int j = i * 27;
			if(j == 1269)
				break; // Out of loop
			if(i % 10 != 0)
				continue; // Top of loop
			printnb(i + " ");
		}
		
	}

}
