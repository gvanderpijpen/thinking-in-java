package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.combining;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class EndClass extends AbstractClass implements Combined {

	@Override
	public void aMethod1() {
		print("EndClass.aMethod1()");
	}

	@Override
	public void aMethod2() {
		print("EndClass.aMethod2()");
	}

	@Override
	public void bMethod1() {
		print("EndClass.bMethod1()");
	}

	@Override
	public void bMethod2() {
		print("EndClass.bMethod2()");
	}

	@Override
	public void cMethod1() {
		print("EndClass.cMethod1()");
	}

	@Override
	public void cMethod2() {
		print("EndClass.cMethod2()");
	}

	@Override
	public void combinedMethod1() {
		print("EndClass.combinedMethod1()");
	}

	@Override
	public void combinedMethod2() {
		print("EndClass.combinedMethod2()");
	}
	
	static void a(A a) {
		a.aMethod1();
		a.aMethod2();
	}
	
	static void b(B b) {
		b.bMethod1();
		b.bMethod2();
	}
	
	static void c(C c) {
		c.cMethod1();
		c.cMethod2();
	}
	
	static void d(Combined c) {
		c.combinedMethod1();
		c.combinedMethod2();
		c.aMethod1();
		c.aMethod2();
		c.bMethod1();
		c.bMethod2();
		c.cMethod1();
		c.cMethod2();
	}

	public static void main(String[] args) {
		EndClass ec = new EndClass();
		a(ec);
		b(ec);
		c(ec);
		d(ec);
	}

}
