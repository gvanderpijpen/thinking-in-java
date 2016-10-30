package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;
/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows the use of VarArgs method arguments<br>
 * <ul>
 * <li>In a regular member method</li>
 * <li>In the main method</li>
 * </ul>
 * 
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class VarArgString {
	
	static void methodOnStrings(String...strings ){
		for(String s : strings){
			print(s);
		}
	}

	public static void main(String... args) {
		
		methodOnStrings("String 1", "String 2", "String 3");
		methodOnStrings(args);

	}

}
