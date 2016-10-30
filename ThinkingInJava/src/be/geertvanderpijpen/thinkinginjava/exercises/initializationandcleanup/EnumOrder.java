package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Uses the {@link Spiciness} enumerator to domonstrate how to find out the declaration order in an enum<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class EnumOrder {
	public static void main(String[] args){
		for(Spiciness s : Spiciness.values()) {
			print(s + ", ordinal : " + s.ordinal());
		}
	}

}
