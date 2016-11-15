package be.geertvanderpijpen.thinkinginjava.examples.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

// Cleanup and inheritance

class Characteristic {
	private String s;
	Characteristic(String s) {
		this.s = s;
		
		print("Creating Characteristic " + s);
	}
	
	protected void dispose() {
		print("Disposing Characteristic " + s);
	}
}


class Description {
	private String s;
	
	Description(String s) {
		this.s = s;
		print("Creating Description " + s);
	}
	
	protected void dispose() {
		print("Disposing Description " + s);
	}
}


class LivingCreature {
	private Characteristic p = new Characteristic("It's alive");
	
	private Description t = new Description("Basic Living Creature");
	
	LivingCreature() {
		print("LivingCreature");
	}
	
	protected void dispose() {
		print("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("Has heart");
	private Description t = new Description("Animal not vegetable");
	
	Animal() {
		print("Animal()");
	}
	
	protected void dispose() {
		print("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("Can live in water");
	private Description t = new Description("Both water and land");
	
	Amphibian() {
		print("Amphibian()");
	}
	
	protected void dispose(){
		print("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}



public class Frog extends Amphibian{
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats bugs");
	
	public Frog() {
		print("Frog()");
	}
	
	protected void dispose() {
		print("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		Frog frog = new Frog();
		print("Bye!");
		frog.dispose();
	}

}
