package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Base1 {
	void testMethod(){
		print("Base1 testMethod()");
	}
	
	char testMethod(char c){
		print("Base1 testMethod(char)");
		return 'f';
	}
	
	int testMethod(int i){
		print("Base1 testMethod(i)");
		return 2;
	}
}


public class Overriding extends Base1 {
	
	String testMethod(String s){
		print("Overriding testMethod(String)");
		return "string";
	}

	public static void main(String[] args) {
		Overriding o = new Overriding();
		o.testMethod();
		o.testMethod('k');
		o.testMethod(38);
		o.testMethod("string");
	}

}
