package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

abstract class CompleteAbstract {
		public void f() {
			print("CompleteAbstract.f()");
		}
		
		public void g() {
			print("CompleteAbstract.g()");
		}
}

public class CompleteAbstractTest {

	public static void main(String[] args) {
		// Compilation error CompleteAbstract ca = new CompleteAbstract();
	}

}
