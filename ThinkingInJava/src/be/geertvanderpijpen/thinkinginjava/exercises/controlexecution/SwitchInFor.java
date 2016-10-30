package be.geertvanderpijpen.thinkinginjava.exercises.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the use of switch in a for loop<br>
 * A switch statement is used that tests on 3 integer values. A match displays the value<br>
 * The surrounding for loop enters the switch with all possible values<br>
 * A second iteration is done, but without breaks in the switch statemetn<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class SwitchInFor {

	public static void main(String[] args) {
		// First, for loop with breaks in the switch statement
		for(int i = 0; i < 3; i++){
			switch(i){
			case 0 : 
				print("Value 0");
				break;
			case 1 : 
				print("Value 1");
				break;
			case 2 :
				print("Value 2");
				break;
			default : 
				print("Default value");	
			}
		}
		
		// Next, the same for loop, but without the breaks in the switch statement
		for(int i = 0; i < 3; i++){
			switch(i){
			case 0 : 
				print("Value 0");
			case 1 : 
				print("Value 1");
			case 2 :
				print("Value 2");
			default : 
				print("Default value");	
			}
		}
	}

}
