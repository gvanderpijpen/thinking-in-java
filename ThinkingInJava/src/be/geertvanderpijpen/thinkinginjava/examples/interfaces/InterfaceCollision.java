package be.geertvanderpijpen.thinkinginjava.examples.interfaces;

interface I1 {
	void f();
}

interface I2 {
	void f(int i);
}

interface I3 {
	int f();
}

class C {
	public int f() {
		return 1;
	}
}

class C2 implements I1, I2 {
	
	@Override
	public void f() {}
	
	/*@Override
	public int f(int i) {
		return 1;
	}*/
	
	@Override
	public void f(int i) {
		
	}
	
}

class C3 implements I2 {
	/*@Override	
	public int f(int i) {
		return 1;
	}*/
	
	@Override
	public void f(int i) {
		
	}
}

class C4 extends C implements I3 {
	@Override
	public int f() {
		return 1;
	}
	
}

// class C5 extends C implements I1 {}

// interface I4 extends I1, I3 {}

public class InterfaceCollision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
