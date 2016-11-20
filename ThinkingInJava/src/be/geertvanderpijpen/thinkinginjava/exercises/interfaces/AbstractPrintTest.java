package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import be.geertvanderpijpen.thinkinginjava.utils.Print;

abstract class AbstractPrinter {
	public abstract void printer();
	
	public AbstractPrinter() {
		print("AbstractPrinter()");
		printer();
	}
}

class Printer extends AbstractPrinter {
	
	int i = 24;
	
	@Override
	public void printer() {
		print("The value of i is " + i);
	}
}

public class AbstractPrintTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
	}

}
