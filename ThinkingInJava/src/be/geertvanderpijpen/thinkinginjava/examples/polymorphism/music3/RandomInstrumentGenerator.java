package be.geertvanderpijpen.thinkinginjava.examples.polymorphism.music3;

import java.util.*;


public class RandomInstrumentGenerator {
	
	private Random rand = new Random(501);
	
	public Instrument next() {
		switch(rand.nextInt(4)) {
			default : 
			case 0  : return new Percussion();
			case 1  : return new Stringed();
			case 2  : return new Woodwind();
			case 3  : return new Clarinet();
		}
	}

}
