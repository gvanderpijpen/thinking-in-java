package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.rodent;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


public abstract class BaseRodent implements Rodent{
	
	private Teeth t = new Teeth("Rodent");
	
	private Smell smell;
	
	
	@Override
	public String toString() {
		return "BaseRodent";
	}
	
	BaseRodent() {
		print("Rodent()");
	}
	
	BaseRodent(Smell smell) {
		print("Rodent(Smell)");
		this.smell = smell;
		smell.addRef();
	}
	
	@Override
	public void dispose() {
		print("Disposing BaseRodent");
		smell.dispose();
	}
	
	

}
