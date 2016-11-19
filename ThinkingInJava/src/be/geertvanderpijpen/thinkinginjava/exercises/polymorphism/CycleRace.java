package be.geertvanderpijpen.thinkinginjava.exercises.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Cycle {
	public void ride() {
		print("Cycle.ride()");
	}
	
	public int wheels() {
		return 0;
	}
}

class Unicycle extends Cycle {
	
	@Override
	public void ride() {
		print("Unicycle.ride() on " + wheels() + " wheels");
	}
	
	@Override
	public int wheels() {
		return 1;
	}
	
	public void balance() {
		print("Unicycle.balance()");
	}
}


class Bicycle extends Cycle {
	
	@Override
	public void ride() {
		print("Bicycle.ride() on " + wheels() + " wheels");
	}
	
	@Override
	public int wheels() {
		return 2;
	}
	
	public void balance() {
		print("Bicycle.balance()");
	}
}

class Tricycle extends Cycle {
	
	@Override
	public void ride() {
		print("Tricycle.ride() on " + wheels() + " wheels");
	}
	
	@Override
	public int wheels() {
		return 3;
	}
}

class Race {
	private Cycle[] contestants;
	
	public Race() {
		contestants = new Cycle[3];
		contestants[0] = new Unicycle();
		contestants[1] = new Bicycle();
		contestants[2] = new Tricycle();
	}
	
	public void startRace() {
		for(Cycle cycle : contestants) {
			cycle.ride();
			// Runtime error ((Unicycle)cycle).balance();
		}
	}
}

public class CycleRace {

	public static void main(String[] args) {
		
		Race race = new Race();
		race.startRace();

	}

}
