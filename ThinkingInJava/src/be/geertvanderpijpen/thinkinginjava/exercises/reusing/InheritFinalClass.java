package be.geertvanderpijpen.thinkinginjava.exercises.reusing;


final class FinalClass {
	
}

// Does not compile class DerivedClass extends FinalClass {}
/**
 * 
 * Part of Thinking in Java, 4th edition
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class InheritFinalClass {

	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
	}

}
