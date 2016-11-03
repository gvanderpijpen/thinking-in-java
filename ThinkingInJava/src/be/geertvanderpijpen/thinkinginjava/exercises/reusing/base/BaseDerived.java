package be.geertvanderpijpen.thinkinginjava.exercises.reusing.base;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class BaseDerived extends Base {

	public static void main(String[] args) {
		BaseDerived bd = new BaseDerived();
		print(bd.secret);
	}

}
