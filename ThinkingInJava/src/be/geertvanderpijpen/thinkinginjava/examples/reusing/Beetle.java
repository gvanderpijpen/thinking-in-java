package be.geertvanderpijpen.thinkinginjava.examples.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Insect {
	private int i = 9; 
	protected int j; 
	
	Insect() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}
	
	private static int x1 = printInit("static Insect.x1 initialized");
	
	static int printInit(String s) {
		print(s);
		return 47;
	}
}


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * The full process of initialization
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Beetle extends Insect {
	
	private int k = printInit("Beetle.k initialized");
	
	public Beetle() {
		print("k = " + k);
		print("j = " + j);
	}
	
	private static int x2 = printInit("Beetle.x2 initialized");

	public static void main(String[] args) {
		print("Beetle constrcutor");
		Beetle b = new Beetle();
		
		FireBeetle fb = new FireBeetle();

	}

}


class FireBeetle extends Beetle {
	private int l = printInit("FireBeetle.l initialized");
	
	public FireBeetle() {
		print("l = " + l);
		print("j = " + j);
	}
	
	private static int x3 = printInit("FireBeetle.x3 initialized");
}
