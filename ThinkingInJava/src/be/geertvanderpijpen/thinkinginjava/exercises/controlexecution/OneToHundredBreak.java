package be.geertvanderpijpen.thinkinginjava.exercises.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Prints all values of 1 to 100 with a for loop<br>
 * The program breaks at value 99<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class OneToHundredBreak {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++){
			print(i);
			if(i == 99)
				return;
		}
	}

}
