package be.geertvanderpijpen.thinkinginjava.examples.operators;

import java.util.Random;
import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows the different relational and logic operators<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		
		print("i = " + i);
		print("j = " + j);
		print("i > j is " + (i > j));
		print("i < j is " + (i < j));
		print("i >= j is " + (i >= j));
		print("i <= j is " + (i <= j));
		print("i == j is " + (i == j));
		print("i != j is " + (i != j));
		
		// Treating an int as a boolean is not legal in Java
		//! print("i && j is " + (i && j));
		//! print("i || j is " + (i || j));
		//! print("!i is " + !i);
		
		print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
		print("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));

	}

}
