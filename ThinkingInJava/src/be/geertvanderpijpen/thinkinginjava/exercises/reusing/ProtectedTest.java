package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import be.geertvanderpijpen.thinkinginjava.exercises.reusing.base.Base;

public class ProtectedTest {

	public static void main(String[] args) {
		Base b = new Base();
		// Does not compile
//		print(b.secret);
	}

}
