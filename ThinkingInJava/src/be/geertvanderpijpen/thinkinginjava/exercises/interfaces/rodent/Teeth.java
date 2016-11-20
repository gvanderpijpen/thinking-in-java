package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.rodent;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Teeth {
	
	private String s;
	Teeth(String s){
		this.s = s;
		print("creating hideous teeth for " + s);
	}

}
