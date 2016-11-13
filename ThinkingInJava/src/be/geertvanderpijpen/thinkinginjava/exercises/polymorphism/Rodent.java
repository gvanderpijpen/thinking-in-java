package be.geertvanderpijpen.thinkinginjava.exercises.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Rodent {
	
	void sleep() {
		print("Rodent.sleep()");
	}
	
	@Override
	public String toString() {
		return "Rodent";
	}
	
	void knibble() {
		print("Rodent.knibble()");
	}

}
