package be.geertvanderpijpen.thinkinginjava.examples.reusing;

class SmallBrain {}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}

// Does not compile class Further extends Dinosaur {}

/**
 * 
 * Part of Thinking in Java, 4th edition <br>
 * Making an entire class final
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Jurassic {

	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}

}
