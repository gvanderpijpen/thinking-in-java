package be.geertvanderpijpen.thinkinginjava.examples.innerclasses;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Parcel4 {
	private class PContents implements Contents {
		private int i = 11; 
		public int value() {
			return i;
		}
		
		private PContents() {
			print("PContents()");
		}
	}
	
	protected class PDestination implements Destination {
		private String label; 
		private PDestination(String whereTo) {
			label = whereTo;
			print("PDestination()");
		}
		public String readLabel() {
			return label;
		}
	}
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
	
	public Contents contents() {
		return new PContents();
	}
}

public class TestParcel {

	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		
		// Illegal, can't access private class
		// Parcel4.PContents c1 = p.new PContents();
	}

}
