package be.geertvanderpijpen.thinkinginjava.exercises.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Gerbil extends Rodent {
	
	@Override
	void sleep() {
		print("Gerbil.sleep()");
	}
	
	@Override
	public String toString() {
		return "Gerbil";
	}
	
	@Override
	void knibble() {
		print("Gerbil.knibble()");
	}

}
