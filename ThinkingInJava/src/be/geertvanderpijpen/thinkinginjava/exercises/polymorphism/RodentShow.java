package be.geertvanderpijpen.thinkinginjava.exercises.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class RodentShow {

	public static void main(String[] args) {
		Rodent[] show = {
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		
		for(Rodent r : show) {
			print("Rodent is a " + r);
			r.sleep();
			r.knibble();
		}
	}

}
