package be.geertvanderpijpen.thinkinginjava.examples.innerclasses;
// Qualifying access to the outer-class object

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class DotThis {
	
	void f() {
		print("DotThis.f()");
	}
	
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
			// A plain this would be Inner's this
		}
	}
	
	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}

}
