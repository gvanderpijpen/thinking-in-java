package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

abstract class EmptyAbstract {
	public abstract void f();
}

class UsefulClass extends EmptyAbstract {
	@Override
	public void f() {
		print("UsefulClass.f()");
	}
}

public class EmptyAbstractTest {
	
	static void callF(EmptyAbstract ea) {
		ea.f();
	}

	public static void main(String[] args) {
		callF(new UsefulClass());

	}

}
