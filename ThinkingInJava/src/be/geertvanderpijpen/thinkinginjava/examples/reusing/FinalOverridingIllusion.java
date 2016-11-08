package be.geertvanderpijpen.thinkinginjava.examples.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class WithFinals {
	// Identical to "private" alone : 
	private final void f() {
		print("WithFinals.f()");
	}
	
	// Also automatically final : 
	private void g() {
		print("WithFinals.g()");
	}
}


class OverridingPrivate extends WithFinals {
	private final void f() {
		print("OverridingPrivate.f()");
	}
	
	private void g() {
		print("OverridingPrivate.g()");
	}
}


class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		print("OverridingPrivate2.f()");
	}
	
	public void g() {
		print("OverridingPrivate2.g()");
	}
}

/**
 * 
 * Part of Thinking in Java, 4th edition
 * @author Geert Vanderpijpen
 * @version 1.0
 * It only looks like you can override a private or final private method	
 */
public class FinalOverridingIllusion {

	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		OverridingPrivate op = op2;
		// Compilation error op.f();
		// Compilation error op.g():
		
		// Same here: 
		WithFinals wf = op2;
		// Compilation error wf.f();
		// Compilation error wf.g();

	}

}
