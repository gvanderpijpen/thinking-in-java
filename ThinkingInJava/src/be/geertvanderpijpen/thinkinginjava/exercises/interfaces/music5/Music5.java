package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.music5;

import be.geertvanderpijpen.thinkinginjava.examples.polymorphism.music.Note;
import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

interface Instrument {
	// Compile-time constant:
	int VALUE = 5;
	// Cannot have method definitions
	// Method signatures defined here are automatically public
	void adjust();
}

interface Playable {
	void play(Note n);
}

abstract class BaseInstrument implements Instrument, Playable {
	
	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	
		
	@Override
	public void adjust() {
		print(this + ".adjust()");
	}
	
}

class Wind extends BaseInstrument {
	
	@Override 
	public String toString() {
		return "Wind";
	}
	
	
}

class Percussion extends BaseInstrument {
	@Override
	public String toString() {
		return "Percussion";
	}
}

class Stringed extends BaseInstrument {
	@Override 
	public String toString() {
		return "Stringed";
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
	static void tune(Playable i) {
		// ...
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Playable[] e) {
		for(Playable i : e) {
			tune(i);
		}
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array 
		Playable[] orchestra = {
				new Wind(), 
				new Percussion(), 
				new Stringed(),
				new Brass(), 
				new Woodwind()
		};
		
		tuneAll(orchestra);
	}

}
