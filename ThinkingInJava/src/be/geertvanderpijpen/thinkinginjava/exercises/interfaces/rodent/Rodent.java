package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.rodent;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Rodent {
	
	private Teeth t = new Teeth("Rodent");
	
	private Smell smell;
	
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
	
	Rodent() {
		print("Rodent()");
	}
	
	Rodent(Smell smell) {
		print("Rodent(Smell)");
		this.smell = smell;
		smell.addRef();
	}
	
	public void dispose() {
		print("Disposing Rodent");
		smell.dispose();
	}

}
