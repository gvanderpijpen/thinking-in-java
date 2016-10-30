package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class ArrayConstruction {

	public static void main(String[] args) {
		ArrayMember[] a1 = new ArrayMember[] {
				new ArrayMember("test"),
				new ArrayMember("string"),
				new ArrayMember("initialization")
		};
	}

}

class ArrayMember{
	
	ArrayMember(String s){
		print(s);
	}
}
