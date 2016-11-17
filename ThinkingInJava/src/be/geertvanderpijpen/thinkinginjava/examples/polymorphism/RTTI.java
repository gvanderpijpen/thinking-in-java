package be.geertvanderpijpen.thinkinginjava.examples.polymorphism;

// Downcasting and Runtime Type Information (RTTI)

class Useful {
	public void f() {}
	public void g() {}
	
}

class MoreUseful extends Useful {
	@Override
	public void f() {}
	
	@Override 
	public void g() {}
	
	public void u() {}
	public void v() {}
	public void w() {}
}

public class RTTI {

	public static void main(String[] args) {
		Useful[] x  = { new Useful(), new MoreUseful() };
		
		x[0].f();
		x[0].g();
		
		// Compile time : method not found for Useful 
		// x[1].u();
		
		((MoreUseful)x[1]).u(); // Downcast/RTTI
		((MoreUseful)x[0]).u(); // Runtime exception thrown
	}

}
