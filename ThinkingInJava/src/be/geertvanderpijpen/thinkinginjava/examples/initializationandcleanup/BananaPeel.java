package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

class Banana{
	void peel(int i){}
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows that 2 instances of a class can call the same method and the compiler knows for what instance the method has been called<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class BananaPeel {

	public static void main(String[] args) {
		Banana a = new Banana(),
			   b = new Banana();
		a.peel(1);
		b.peel(2);

	}

}
