package be.geertvanderpijpen.thinkinginjava.exercises.innerclasses;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import be.geertvanderpijpen.thinkinginjava.examples.innerclasses.Sequence;

class StringElement {
	String label; 
	StringElement(String label) {
		this.label = label; 
	}
	
	public String toString() {
		return label;
	}
}

public class StringSequence {

	public static void main(String[] args) {
		Sequence sequence = new Sequence(15);
		
		for(int i=0; i<15; i++) {
			sequence.add(new StringElement(Integer.toString(i)));
		}
		
		sequence.iterate();
		
	}

}
