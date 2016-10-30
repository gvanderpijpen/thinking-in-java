package be.geertvanderpijpen.thinkinginjava.exercises.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.util.Random;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * A random number is generated. 25 other random numbers are generated and at each time compared to the first number<br>
 * This process is repeated ad infinitum<br>
 * <strong>Beware</strong>, this program invokes an infinity loop<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class CompareRandomsInifinte {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		while(true){
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

}
