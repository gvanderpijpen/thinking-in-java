package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class TernaryIfElse {

	/**
	 * Returns integer value based on input using ternary operator<br>
	 * @param i : integer value to test
	 * @return integer that is i times 100 if i is smaller then 10, otherwise i times 10
	 */
	static protected int ternary(int i){
		return i < 10 ? i * 100 : i * 10;
	}
	
	/**
	 * Returns integer value based on input using standard if-else structure<br>
	 * @param i : integer value to test
	 * @return integer that is i times 100 if i is smaller than 10, otherwise i times 10
	 */
	static protected int standardIfElse(int i){
		if(i < 10){
			return i * 100;
		}
		else{
			return i * 10;
		}
	}
	
	public static void main(String[] args) {
		print(ternary(9));
		print(ternary(10));
		print(standardIfElse(9));
		print(standardIfElse(10));
		
	}

}
