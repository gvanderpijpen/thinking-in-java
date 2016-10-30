package be.geertvanderpijpen.thinkinginjava.examples.accesscontrol.dessert2;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Cookie {
	public Cookie(){
		print("Cookie constructor");
	}
	
	protected void bite(){
		print("bite");
	}

}
