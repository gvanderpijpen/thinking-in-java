package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import be.geertvanderpijpen.thinkinginjava.exercises.interfaces.threemethods.ThreeMethods;
import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class ThreeMethodsTest implements ThreeMethods {

	@Override
	public void a() {
		print("ThreeMethodsTest.a()");

	}

	@Override
	public void b() {
		print("ThreeMethodsTest.b()");

	}

	@Override
	public void c() {
		print("ThreeMethodsTest.c()");

	}
	
	public static void main(String[] args) {
		ThreeMethodsTest tmt = new ThreeMethodsTest();
		tmt.a();
		tmt.b();
		tmt.c();
	}

}
