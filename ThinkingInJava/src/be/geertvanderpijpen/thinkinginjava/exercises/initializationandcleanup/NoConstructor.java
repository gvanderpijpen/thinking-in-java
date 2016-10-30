package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


class NoConstructorInstance{
	int i;
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * A class with no explicit constructor and an integer member field is instantiated<br>
 * The integer member field is then printed to prove that an implicit constructor has been called<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class NoConstructor {

	public static void main(String[] args) {
		NoConstructorInstance nci = new NoConstructorInstance();
		print(nci.i);
	}

}
