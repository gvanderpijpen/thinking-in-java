package be.geertvanderpijpen.thinkinginjava.exercises.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.util.Random;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Simulates coin flipping by using the {@link Random} class.
 * The output is head or tails
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class CoinFlipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<100; i++){
			flipCoin();
		}

	}
	
	private static void flipCoin(){
		Random flip = new Random();
		
		int result = flip.nextInt(5000) + 1;
		if((result % 2) == 0 ){
			print("head");
		}
		else{
			print("tail");
		}
	}

}
