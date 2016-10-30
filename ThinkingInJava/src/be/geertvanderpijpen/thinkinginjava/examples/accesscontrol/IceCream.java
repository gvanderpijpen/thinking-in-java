package be.geertvanderpijpen.thinkinginjava.examples.accesscontrol;

class Sundae{
	private Sundae(){}
	
	static Sundae makeASundae(){
		return new Sundae();
	}
}

public class IceCream {

	public static void main(String[] args) {
		//Sundae x = new Sundae;
		Sundae x = Sundae.makeASundae();
	}

}