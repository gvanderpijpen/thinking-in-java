package be.geertvanderpijpen.thinkinginjava.examples.interfaces.music4;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import be.geertvanderpijpen.thinkinginjava.examples.polymorphism.music.Note;

// Abstract classes and methods

abstract class Instrument {
	private int i; // Storage allocated for each
	public abstract void play(Note n);
	public String what() {
		return "Instrument";
	}
	public abstract void adjust();
}

class Wind extends Instrument {
	@Override
	public void play(Note n) {
		print("Wind.play(" + n + ")");
	}
	
	public String what() {
		return "Wind";
	}
	
	@Override
	public void adjust() {}
}

class Percussion extends Instrument {
	@Override
	public void play(Note n) {
		print("Percussion.play(" + n + ")");
	}
	
	public String what() {
		return "Percussion";
	}
	
	@Override
	public void adjust() {}
}

class Stringed extends Instrument {
	@Override 
	public void play(Note n) {
		print("Stringed.play(" + n + ")");
	}
	
	public String what() {
		return "Stringed";
	}
	
	@Override
	public void adjust() {}
}

class Brass extends Wind {
	@Override 
	public void play(Note n) {
		print("Brass.play(" + n + ")");
	}
	
	@Override
	public void adjust() {
		print("Brass.adjust()");
	}
}

class Woodwind extends Wind {
	@Override
	public void play(Note n) {
		print("Woodwind.play(" + n + ")");
	}
	
	public String what() {
		return "Woodwind";
	}
}

public class Music4 {
	// Doesn't care about type, so new types added to the system will work right
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array
		Instrument[] orchestra = {
				new Wind(), 
				new Percussion(),
				new Stringed(), 
				new Brass(),
				new Woodwind()
		};
		
		tuneAll(orchestra);
	}

}
