package be.geertvanderpijpen.thinkinginjava.exercises.innerclasses;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class PrivateOuterTest {
	
	class PrivateInnerTest {
		
		void callTest(int j) {
			i=j;
			test();
		}
		
		private int l = 10;
		
	}
	
	private int i = 10;
	
	private void test() {
		print("test(), i = " + i);
	}
	
	public void testAccess(int k) {
		PrivateInnerTest pit = new PrivateInnerTest();
		pit.callTest(k);
		print("private field of pit = " + pit.l);
	}

	public static void main(String[] args) {
		PrivateOuterTest pot = new PrivateOuterTest();
		pot.testAccess(30);
	}

}
