package be.geertvanderpijpen.thinkinginjava.exercises.controlexecution;

import static  be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Prints a Fibonacci sequence of n lenght, where n is passed as argument to the class<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Fibonacci {

	public static void main(String[] args) {
		if(args.length != 1){
			print("ERROR : one argument is expected!!");
			return;
		}
		
		int aantal = Integer.parseInt(args[0]);
		print("Generating Fibonacci of " + aantal + " length");
		
		if(aantal < 1){
			print("ERROR : a sequence of at least one number is required");
			return;
		}
		
		if(aantal == 1){
			print(1);
			return;
		}
		
		if(aantal == 2){
			print("1 1");
			return;
		}
		
		printnb("1 1 ");
		int prev = 1; 
		int prevprev = 1;
		for(int i = 3; i <= aantal; i++){
			int current =  prev + prevprev;
			printnb(current + " ");
			prevprev = prev;
			prev = current;
		}
	}

}
