package be.geertvanderpijpen.thinkinginjava.examples.reusing;

/**
 * 
 * @author gvanderpijpen
 * Inheritance and upcasting
 *
 */
public class Instrument {
	
	public void play() {}
	static void tune(Instrument i) { 
		i.play();
	}

}
