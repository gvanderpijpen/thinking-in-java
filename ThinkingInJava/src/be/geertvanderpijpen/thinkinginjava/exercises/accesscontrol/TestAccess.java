package be.geertvanderpijpen.thinkinginjava.exercises.accesscontrol;

public class TestAccess {

	public static void main(String[] args) {
		AccessControlTest act = new AccessControlTest();
		
//		act.privateTest();
		act.protectedTest();
		act.packageTest();
		act.publicTest();
	}

}
