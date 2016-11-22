package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

//Order of constructor calls

class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Pickles {
	Pickles() {
		print("Pickles()");
	}
}


class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}


class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}


interface Fastfood {
	public void injectFat();
	public void makeSick();
}


public class Sandwich extends PortableLunch implements Fastfood{
	
	private Bread b = new Bread();
	private Cheese c  = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickles p = new Pickles();
	
	public Sandwich() {
		print("Sandwich()");
	}

	public static void main(String[] args) {
		Sandwich sandwich = new Sandwich();
		sandwich.injectFat();
		sandwich.makeSick();
	}
	
	@Override
	public void injectFat() {
		print("Sandwich.injectFat()");
	}
	
	
	@Override
	public void makeSick() {
		print("Sandwich.makeSick()");
	}

}
