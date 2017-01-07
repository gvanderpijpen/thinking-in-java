package be.geertvanderpijpen.thinkinginjava.exercises.innerclasses.seperatepackages.inheritances;

import be.geertvanderpijpen.thinkinginjava.exercises.innerclasses.seperatepackages.implementations.*;
import be.geertvanderpijpen.thinkinginjava.exercises.innerclasses.seperatepackages.interfaces.TestInterface;

public class InheritedImplementation extends TestImplementation {
	
	public TestInterface getInterface() {
		return new InterfaceImplementation();
	}

	public static void main(String[] args) {
		InheritedImplementation implementation = new InheritedImplementation();
		TestInterface ti = implementation.getInterface();
		ti.test();
	}

}
