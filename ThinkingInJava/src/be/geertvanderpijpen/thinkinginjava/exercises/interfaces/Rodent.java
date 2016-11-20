package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public abstract class Rodent {
	
	private Teeth t = new Teeth("Rodent");
	
	private Smell smell;
	
	abstract void sleep();
	
	@Override
	public String toString() {
		return "Rodent";
	}
	
	abstract void knibble();
	
	Rodent() {
		print("Rodent()");
	}
	
	Rodent(Smell smell) {
		print("Rodent(Smell)");
		this.smell = smell;
		smell.addRef();
	}
	
	public void dispose(){
		print("Disposing Rodent");
		smell.dispose();
	}

}
