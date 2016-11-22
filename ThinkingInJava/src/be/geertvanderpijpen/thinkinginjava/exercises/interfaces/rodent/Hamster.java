package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.rodent;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Hamster extends BaseRodent {
	
	private Teeth t = new Teeth ("Hamster");
	
	@Override
	public void sleep() {
		print("Hamster.sleep()");
	}
	
	@Override 
	public String toString() {
		return("Hamster");
	}
	
	@Override
	public void knibble() {
		print("Hamster.knibble");
	}

	Hamster() {
		print("Hamster()");
	}
	
	Hamster(Smell smell) {
		super(smell);
		print("Hamster created");
	}
	
	@Override
	public void dispose() {
		print("Disposing Hamster");
		super.dispose();
	}
}
