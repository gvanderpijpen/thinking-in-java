package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;
import static be.geertvanderpijpen.thinkinginjava.utils.Range.*;

public class ForEachInt {

	public static void main(String[] args) {
		for(int i : range(10))
			printnb(i + " ");
		print();
		for(int i : range(5, 10))
			printnb(i + " ");
		print();
		for(int i : range(5, 20, 3))
			printnb(i + " ");
		print();
	}

}
