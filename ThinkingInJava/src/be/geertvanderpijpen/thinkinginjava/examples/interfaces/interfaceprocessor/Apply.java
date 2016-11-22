package be.geertvanderpijpen.thinkinginjava.examples.interfaces.interfaceprocessor;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using processor " + p.name());
		print(p.process(s));
	}

}
