package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class BaseFinalMethod {
	final void testMethod() {
		print("BaseFinalMethod.testMethod()");
	}
}

public class OverrideFinalMethod extends BaseFinalMethod {
	
/*	@Override
	void testMethod() {
		print("OverrideFinalMethod.testMethod()");
	} */
	
	public static void main(String[] args) {
		OverrideFinalMethod ofm = new OverrideFinalMethod();
		ofm.testMethod();
		BaseFinalMethod bfm = ofm;
		ofm.testMethod();
	}

}
