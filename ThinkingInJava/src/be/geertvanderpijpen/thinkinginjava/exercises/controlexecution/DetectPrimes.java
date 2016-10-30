package be.geertvanderpijpen.thinkinginjava.exercises.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Detects all primes up until 1000<br>
 * This is done by 2 nested for loops<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class DetectPrimes {

	public static void main(String[] args) {
		for(int i = 1; i <= 1000; i++){
			boolean isPrime = true;
			for(int j = 2; j < i; j++){
				if((i % j) == 0)
					isPrime = false;
			}
			
			if(isPrime){
				print(i + " is a prime");
			}
		}
	}

}
