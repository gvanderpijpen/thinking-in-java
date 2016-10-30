package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class A {
	A(int i){
		print("A constructor");
	}
}

class B {
	B(int i){
		print("B constructor");
	}
}

public class C extends A{
	private B b;
	
	public C(){
		super(15);
		b = new B(12);
		print("C constructor");
	}
	
	public C(int i){
		super(i);
		b = new B(15);
		print("C(int) constructor");
	}
	
	public static void main(String [] args){
		C c = new C();
		C c2 = new C(13);
	}

}
