package be.geertvanderpijpen.thinkinginjava.exercises.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.util.Random;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * A random number is generated. For 25 iterations, a second random numer is generated and compared to the first value<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class CompareRandoms {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int key = rand.nextInt(3000);
		
		for(int i = 0; i < 25; i++){
			int value = rand.nextInt(3000);
			printnb(value + " ");
			if( value < key){
				print(" < " + key);
			}
			else if( value == key){
				print(" = " + key);
			}
			else{
				print(" > " + key);
			}
		}

	}

}
