package be.geertvanderpijpen.thinkinginjava.exercises.innerclasses;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Outer {
	
	private String s = "Outer private String";
	
	class Inner {
		
		Inner() {
			print("Inner constructor");
		}
		
		public String toString() {
			return s;
		}
		
	}
	
	public Inner newInner() { 
		return new Inner();
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.newInner();
		// reference wihtout mentioning outer class works
		Inner i2 = o.newInner();
		print(i2);
	}

}
