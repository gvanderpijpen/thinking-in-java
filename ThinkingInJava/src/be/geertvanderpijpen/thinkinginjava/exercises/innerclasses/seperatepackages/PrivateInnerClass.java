package be.geertvanderpijpen.thinkinginjava.exercises.innerclasses.seperatepackages;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import be.geertvanderpijpen.thinkinginjava.exercises.innerclasses.seperatepackages.interfaces.TestInterface;

public class PrivateInnerClass {
	
	private class PrivateImplementation implements TestInterface {
		public void test() {
			print("PrivateImplementation.test()");
		}
	}	
	
	public TestInterface getTestInterface() {
		return new PrivateImplementation();
	}

	public static void main(String[] args) {
		PrivateInnerClass pic = new PrivateInnerClass();
		TestInterface ti = pic.getTestInterface();
		ti.test();
	}

}
