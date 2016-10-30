package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Contains one member {@link Value#i} that is an integer. <br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
class Value{
	int i;
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows that the {@link Object#equals(Object)} method default behaviour is 
 * to compare Object references. If the contents of class instances need to be compared, 
 * this default behaviour needs to be overwritten<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class EqualsMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value();
		Value v2 = new Value();
		
		v1.i = v2.i = 47; 
		
		print(v1.equals(v2));
		

	}

}
