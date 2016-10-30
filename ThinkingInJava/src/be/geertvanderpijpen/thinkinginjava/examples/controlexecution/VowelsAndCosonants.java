package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import java.util.Random;
import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the switch statement by randomly generating letters and determining if they are vowels or cosonants<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class VowelsAndCosonants {

	public static void main(String[] args) {
		Random rand = new Random(47);
		for(int i = 0; i < 100; i++){
			int c = rand.nextInt(26) + 'a';
			printnb((char)c + ", " + c + ": ");
			switch(c){
			case 'a' : 
			case 'e' : 
			case 'i' :
			case 'o' : 
			case 'u' : 
				print("vowel");
				break;
			case 'y' :
			case 'w' : 
				print("Sometimes a vowel");
				break;
			default : 
				print("consonant");
			}
		}
		
	}

}
