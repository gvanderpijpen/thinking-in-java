package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;


class Bird2{
	Bird2(int i){}
	Bird2(double d){}
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates that if a class contains a constructor, no default constructor is injected by Java<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class NoSynthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bird2 b = new Bird2(); Commented because does not compile
		Bird2 b2 = new Bird2(1);
		Bird2 b3 = new Bird2(1.0);

	}

}
