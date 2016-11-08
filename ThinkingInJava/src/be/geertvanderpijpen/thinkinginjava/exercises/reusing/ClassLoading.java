package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class ClassLoading {
	
	private static int i = printInit("ClassLoading.i initialized");
	
	private static int printInit(String s) {
		print(s);
		return 50;
	}
	
	ClassLoading() {
		print("ClassLoading()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Hey, there!");

	}

}
