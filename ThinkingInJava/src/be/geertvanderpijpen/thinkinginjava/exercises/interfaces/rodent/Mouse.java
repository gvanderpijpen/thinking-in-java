package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.rodent;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Mouse extends Rodent {
	
	private Teeth t = new Teeth("Mouse");
	
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
	
	Mouse() {
		print("Mouse()");
	}
	
	Mouse(Smell smell) {
		super(smell);
		print("Mouse created");
	}
	
	@Override
	public void dispose() {
		print("Dispose Mouse");
		super.dispose();
	}

}
