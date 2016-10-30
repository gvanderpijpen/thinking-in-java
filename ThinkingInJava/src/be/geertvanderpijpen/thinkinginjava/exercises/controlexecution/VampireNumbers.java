package be.geertvanderpijpen.thinkinginjava.exercises.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Finds all 4-digit vampire numbers<br>
 * Vampire numbers are numbers that<br>
 * <ul>
 * <li>Have an even number of digits</li>
 * <li>Have the same digits as 2 numbers of half their digits</li>
 * <li>Those numbers must multiply to form the Vampire numbers</li>
 * </ul>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class VampireNumbers {

	public static void main(String[] args) {
		
		// Loop the different 2-digit numbers
		for(int i=10; i<100; i++){
			// Only loop for j until value of i, other pairs are mirrored
			inner:
			for(int j=10; j<=i; j++){
				
				// Multiply the 2 pairs
				int multiply = i*j;
				
				// Only test if result is 4 digits
				if(multiply < 1000)
					continue;
				
				int[] pairDigits = new int[10];
				int[] multiplyDigits = new int[10];
				
				for(int k=0; k < 10; k++){
					pairDigits[k] = 0;
					multiplyDigits[k] = 0;
				}
				
				// Determine digits in pair numbers
				pairDigits[(i % 10)]++;
				pairDigits[(i / 10)]++;
				pairDigits[(j % 10)]++;
				pairDigits[(j / 10)]++;
				
				// Determine digits in multiply numbers
				multiplyDigits[(multiply / 1000)]++;
				multiplyDigits[(multiply / 100) % 10]++;
				multiplyDigits[(multiply / 10) % 10]++;
				multiplyDigits[(multiply % 10)]++;
				
				for(int k = 0; k < 10; k++){
					if(pairDigits[k] != multiplyDigits[k])
						continue inner;
				}
				
				// When this point is reached: vampire number
				print(multiply + " = " + i + " * " + j);
			    
			}
		}

	}

}
