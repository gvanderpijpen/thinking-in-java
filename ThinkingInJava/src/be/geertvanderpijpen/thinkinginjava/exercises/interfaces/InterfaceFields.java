package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import be.geertvanderpijpen.thinkinginjava.examples.interfaces.Months;

public class InterfaceFields {

	public static void main(String[] args) {
		print("Interface fields are static : " + Months.AUGUST);
		
		// Does not compile because interface fields are final
		// Months.DECEMBER = 13;
	}

}
