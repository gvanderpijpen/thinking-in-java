package be.geertvanderpijpen.thinkinginjava.exercises.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition <br>
 * Class containing one float member to demonstrate aliasing<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
class FloatContainer{
	
	/**
	 * float member that has no use except for demonstrating aliasing<br>
	 */
	float f;
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Showcases aliasing by a class with a float member<br>
 * 2 seperate instances of the class are created with different values for the class member<br>
 * After that, the second instance is assigned to the first instance of the class<br>
 * The member field of the first instance is modified<br>
 * The two instances member fields are printed showing they have the same value and proving aliasing<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class AliasingShowcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloatContainer c1 = new FloatContainer();
		FloatContainer c2 = new FloatContainer();
		
		c1.f = 1.1f;
		c2.f = 2.2f;
		
		print("1. c1.f = " + c1.f + ", c2.f = " + c2.f);
		c2 = c1; 
		print("2. c1.f = " + c1.f + ", c2.f = " + c2.f);
		
		c2.f = 3.3f;
		print("3. c1.f = " + c1.f + ", c2.f = " + c2.f);
	}

}
