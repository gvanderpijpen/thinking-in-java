package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.rodent;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Gerbil extends BaseRodent {
	
	private Teeth t = new Teeth("Gerbil");
	
	@Override
	public void sleep() {
		print("Gerbil.sleep()");
	}
	
	@Override
	public String toString() {
		return "Gerbil";
	}
	
	@Override
	public void knibble() {
		print("Gerbil.knibble()");
	}
	
	Gerbil() {
		print("Gerbil()");
	}
	
	Gerbil(Smell smell) {
		super(smell);
		print("Gerbil created");
	}
	
	@Override
	public void dispose() {
		print("Dispose Gerbil");
		super.dispose();
	}

}
