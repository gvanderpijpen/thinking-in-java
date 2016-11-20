package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class RodentShow {

	public static void main(String[] args) {
		Smell smell = new Smell();
		Rodent[] show = {
				new Mouse(smell),
				new Gerbil(smell),
				new Hamster(smell)
		};
		
		for(Rodent r : show) {
			print("Rodent is a " + r);
			r.sleep();
			r.knibble();
			r.dispose();
		}
	}

}
