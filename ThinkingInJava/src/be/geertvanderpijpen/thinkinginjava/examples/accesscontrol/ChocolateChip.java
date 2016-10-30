package be.geertvanderpijpen.thinkinginjava.examples.accesscontrol;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import be.geertvanderpijpen.thinkinginjava.examples.accesscontrol.dessert2.*;

public class ChocolateChip extends Cookie {

	public ChocolateChip(){
		print("ChocolateChip constructor");
	}
	
	public void chomp(){
		bite();
	}
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();

	}

}
