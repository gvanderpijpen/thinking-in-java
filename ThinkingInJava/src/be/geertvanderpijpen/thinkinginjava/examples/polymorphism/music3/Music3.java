package be.geertvanderpijpen.thinkinginjava.examples.polymorphism.music3;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;
import be.geertvanderpijpen.thinkinginjava.examples.polymorphism.music.Note;

class Instrument {
	void play(Note n) {
		print("Instrument.play() " + n);
	}
	

	@Override
	public String toString() {
		return("Instrument");
	}
	
	void adjust() {
		print("Adjusting Instrument");
	}
}


class Wind extends Instrument {
	
	@Override
	void play(Note n) {
		print("Wind.play() " + n);
	}
	
	@Override
	public String toString() {
		return "Wind";
	}
	
	@Override
	void adjust() {
		print("Adjusting Wind");
	}
}


class Percussion extends Instrument {
	
	@Override
	void play(Note n) {
		print("Percussino.play() " + n);
	}
	
	@Override
	public String toString() {
		return "Percussion";
	}
	
	@Override
	void adjust() {
		print("Adjusting Percussion");
	}
}


class Stringed extends Instrument {
	
	@Override
	void play(Note n) {
		print("Stringed.play() " + n);
	}
	
	@Override
	public String toString() {
		return "Stringed";
	}
	
	@Override
	void adjust() {
		print("Adjusting Stringed");
	}
}

class Brass extends Wind {
	
	@Override
	void play(Note n) {
		print("Brass.play() " + n);
	}
	
	@Override
	void adjust() {
		print("Adjusting Brass");
	}
}


class Woodwind extends Wind {
	
	@Override
	void play(Note n) {
		print("Woodwind.play() " + n);
	}
	
	@Override
	public String toString() {
		return "Woodwind";
	}
}


class Clarinet extends Brass {
	
	@Override
	void play(Note n) {
		print("Clarinet.play " + n);
	}
	
	@Override
	public String toString(){
		return("Clarinet");
	}
	
	@Override
	void adjust() {
		print("Adjusting Clarinet");
	}
}

public class Music3 {
	
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
	
	// Doesn't care about type, so new types
	// added to the system will work right : 
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e) {
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
				new Woodwind(),
				new Clarinet()
		};
		
		tuneAll(orchestra);
		
		print("The orchestra consists of following instruments");
		for(Instrument i : orchestra) {
			print(i);
		}
		
		// Generate a random orchestra
		Instrument[] randomOrchestra = new Instrument[30];
		for(int i = 0; i < randomOrchestra.length; i++)
			randomOrchestra[i] = gen.next();
		
		tuneAll(randomOrchestra);
		
		for(Instrument i : randomOrchestra) {
			print(i);
		}
	}

}
