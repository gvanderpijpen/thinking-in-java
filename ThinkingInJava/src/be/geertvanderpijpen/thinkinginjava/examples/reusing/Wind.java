package be.geertvanderpijpen.thinkinginjava.examples.reusing;

/**
 * 
 * @author gvanderpijpen
 * Inheritance and upcasting 
 * Wind objects are instruments 
 * because they have the same interface
 *
 */
public class Wind extends Instrument {

	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute);
	}

}
