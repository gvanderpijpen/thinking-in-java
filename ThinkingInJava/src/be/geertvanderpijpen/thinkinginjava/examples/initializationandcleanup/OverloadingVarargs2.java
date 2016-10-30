package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


public class OverloadingVarargs2 {
	
	static void f(float i, Character... args){
		print("first");
	}
	
	static void f(Character... args){
		print("second");
	}

	public static void main(String[] args) {
		f(1,'a');
		
// The following line introduces an ambiguity compile time error
//		f('a','b');
	}

}
