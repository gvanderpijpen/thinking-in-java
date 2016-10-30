package be.geertvanderpijpen.thinkinginjava.exercises.accesscontrol;

import be.geertvanderpijpen.thinkinginjava.exercises.accesscontrol.protect.ProtectedPackageMethods;

public class ProtectedTest {

	public static void main(String[] args) {
		ProtectedMethods pm = new ProtectedMethods();
		ProtectedPackageMethods ppm = new ProtectedPackageMethods();
		
		pm.test();
//		ppm.test();
	}

}
