package be.geertvanderpijpen.thinkinginjava.examples.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Grain {
	@Override
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	@Override
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	
	@Override
	Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn {

	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		
		print(g);
		
		m = new WheatMill(); // Upcasting
		g = m.process();
		
		print(g);
	}

}
