package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import be.geertvanderpijpen.thinkinginjava.examples.reusing.Detergent;

/**
 * 
 * Part of Thinking in Java, 4th edition
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Sterelizer extends Detergent {
	
	public void scrub(){
		append(" Sterelizer.scrub() ");
		super.scrub();
	}
	
	public void sterelize(){
		append(" sterelize() ");
	}
	

	public static void main(String[] args) {
		Sterelizer x = new Sterelizer();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.sterelize();
		print(x);
		print("Testing base class : ");
		Detergent.main(args);

	}

}
