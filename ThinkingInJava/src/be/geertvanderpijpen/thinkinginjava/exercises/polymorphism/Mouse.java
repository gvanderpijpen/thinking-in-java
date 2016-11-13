package be.geertvanderpijpen.thinkinginjava.exercises.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Mouse extends Rodent {
	
	@Override
	void sleep() {
		print("Mouse.sleep()");
	}
	
	
	@Override
	public String toString() {
		return "Mouse";
	}
	
	@Override
	public void knibble() {
		print("Mouse.knibble()");
	}

}
