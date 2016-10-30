package be.geertvanderpijpen.thinkinginjava.exercises.accesscontrol;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class AccessControlTest {
	
	private void privateTest(){
		print("privateTest()");
	}
	
	protected void protectedTest(){
		print("protectedTest()");
	}
	
	void packageTest(){
		print("packageTest()");
	}
	
	public void publicTest(){
		print("publicTest()");
	}

}
