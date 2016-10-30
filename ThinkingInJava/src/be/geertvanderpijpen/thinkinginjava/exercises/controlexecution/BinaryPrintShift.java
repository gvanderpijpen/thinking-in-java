package be.geertvanderpijpen.thinkinginjava.exercises.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Using integer variables, 31 shifts are done and at each time showing the results in binary form<br>
 * 2 shifts are done
 * <ul>
 * <li>31 unsigned right shifts of 1 bit on a number that has a 1 in the most significant bit (in this case Integer.MIN_VALUE)</li>
 * <li>31 unsigned right shifts of 1 bit on the number -1
 * </ul>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class BinaryPrintShift {

	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		completeShiftInteger(i);
		i = -1;
		completeShiftInteger(i);
		
		String hello = "Hello World";
		for (i=0; i<hello.length(); i++){
			charToBinaryString(hello.charAt(i));
		}
		
		binaryPrint(-18);
	}
	
	private static String binaryPrint(int n){
		char bit;
		String result="";
		
		for(int i = 0; i < Integer.SIZE; i++){
			bit = ((n & 1) == 1) ? '1' : '0';
			result=bit + result;
			n >>= 1;
		}
		
		return(result);
	}
	
	private static void completeShiftInteger(int number){
		print(binaryPrint(number));
		for (int count=1; count < 32; count++){
			number >>= 1;
			print(binaryPrint(number));	
		}		
	}
	
	/**
	 * Shows the binary representation of a character
	 * @param c Character to be shown in binary
	 */
	protected static void charToBinaryString(char c){
		print("Character " + c + " is : " + Integer.toBinaryString(c));
	}

}
