package be.geertvanderpijpen.thinkinginjava.examples.interfaces.music5;

import be.geertvanderpijpen.thinkinginjava.examples.polymorphism.music.Note;
import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

interface Instrument {
	// Compile-time constant:
	int VALUE = 5;
	// Cannot have method definitions
	// Method signatures defined here are automatically public
	void play(Note n);
	void adjust();
}

class Wind implements Instrument {
	
	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	
	@Override 
	public String toString() {
		return "Wind";
	}
	
	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
	
	
}

class Percussion implements Instrument {
	@Override
	public void play(Note n) {
		print(this + ".play()" + n);
	}
	
	@Override
	public String toString() {
		return "Percussion";
	}
	
	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed implements Instrument {
	@Override
	public void play(Note n) {
		print(this + ".play()" + n);
	}
	
	@Override 
	public String toString() {
		return "Stringed";
	}
	
	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass extends Wind {
	 @Override
	 public String toString() {
		 return "Brass";
	 }
}

class Woodwind extends Wind {
	@Override 
	public String toString() {
		return "Woodwind";
	}
}

public class Music5 {
	
	// Doesn't care about types, so types
	// added to the system will work right
	static void tune(Instrument i) {
		// ...
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
