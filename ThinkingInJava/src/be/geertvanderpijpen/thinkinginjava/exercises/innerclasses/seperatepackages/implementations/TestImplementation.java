package be.geertvanderpijpen.thinkinginjava.exercises.innerclasses.seperatepackages.implementations;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import be.geertvanderpijpen.thinkinginjava.exercises.innerclasses.seperatepackages.interfaces.TestInterface;

public class TestImplementation {
	protected class InterfaceImplementation implements TestInterface {
		public void test() {
			print("InterfaceImplementation.test()");
		}	
		
		public InterfaceImplementation(){
			print("InterfaceImplementation()");
		}
	}

}
