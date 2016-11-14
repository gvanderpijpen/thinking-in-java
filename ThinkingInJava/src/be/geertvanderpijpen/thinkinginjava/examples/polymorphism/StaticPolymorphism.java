package be.geertvanderpijpen.thinkinginjava.examples.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

// Static methods are not polymorphic

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}
	
	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}
	
	@Override
	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub(); //Upcast
		print(sup.staticGet());
		print(sup.dynamicGet());
	}
}
