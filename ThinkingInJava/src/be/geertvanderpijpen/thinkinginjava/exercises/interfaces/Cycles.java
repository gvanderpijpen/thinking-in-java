package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

interface Cycle {
	void ride();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	private static final int WHEELS = 1;
	
	public void ride() {
		print("Unicycle ride with " + WHEELS + " wheels");
	}
}

class UnicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class Bicycle implements Cycle {
	private static final int WHEELS = 2;
	
	public void ride() {
		print("Bicycle ride with " + WHEELS + " wheels");
	}
}

class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Bicycle();
	}
}

class Tricycle implements Cycle {
	private static final int WHEELS = 3;
	
	public void ride() {
		print("Tricycle ride with " + WHEELS + " wheels");
	}
}

class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}

public class Cycles {
	
	public static void rideCycle(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.ride();
	}

	public static void main(String[] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());
	}

}
