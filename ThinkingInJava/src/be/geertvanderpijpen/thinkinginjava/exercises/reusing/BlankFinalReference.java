package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class BlankTest {
	public BlankTest(){
		print("BlankTest()");
	}
}

public class BlankFinalReference {
	
	// Blank final reference
	final BlankTest bt;
	
	public BlankFinalReference(){
		// Does not compile print(bt);
		bt = new BlankTest();
	}

	public static void main(String[] args) {
		BlankFinalReference bfr = new BlankFinalReference();
	}

}
