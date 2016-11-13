package be.geertvanderpijpen.thinkinginjava.exercises.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Hamster extends Rodent {
	
	@Override
	void sleep() {
		print("Hamster.sleep()");
	}
	
	@Override 
	public String toString() {
		return("Hamster");
	}
	
	@Override
	void knibble() {
		print("Hamster.knibble");
	}

}
