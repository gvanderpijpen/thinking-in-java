package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;
class Tank{
	int level;
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates that attribution of objects is in fact copy of references<br>
 * 2 objects are created and assigend different member field values<br> 
 * After that, the second object is assigned to the first obejct<br>
 * Both of the member field values are now the same<br>
 * The first object's member field value is now changed and a print shows that this changes the 
 * second object's member field value as well, proving that only the references were copied.
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Assignment {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		t1.level = 9;
		t2.level = 47;
		
		print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1 = t2;
		print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = 27;
		print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
		
	}

}
