package be.geertvanderpijpen.thinkinginjava.exercises.innerclasses;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class OuterTest {
	class Inner {
		Inner() {
			print("Inner()");			
		}
	}
	
	OuterTest() {
		print("Outer()");
	}
}

public class NewInner {

	public static void main(String[] args) {
		OuterTest outer = new OuterTest();
		OuterTest.Inner inner = outer.new Inner();
	}

}
