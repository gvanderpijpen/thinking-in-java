package be.geertvanderpijpen.thinkinginjava.examples.polymorphism.music;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

// Wind objects are Instruments because they have the same interface : 


public class Wind extends Instrument {
	
	// Redefine of interface method:
	@Override
	public void play(Note n) {
		print("Wind.play() " + n);
	}

}
