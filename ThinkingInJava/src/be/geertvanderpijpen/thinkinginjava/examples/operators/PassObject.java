package be.geertvanderpijpen.thinkinginjava.examples.operators;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Contains a char member c to demonstrate aliasing during method calls<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
class Letter{
	/**
	 * A character
	 */
	char c;
}


public class PassObject {
	
	static void f(Letter y){
		y.c = 'z';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
