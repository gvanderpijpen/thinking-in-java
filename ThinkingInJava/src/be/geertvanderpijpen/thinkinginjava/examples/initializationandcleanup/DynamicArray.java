package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows dynamic array initialization. An array is created by passed arguments in the method call<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class DynamicArray {

	public static void main(String[] args) {
		Other.main(new String[]{ "fiddle", "de", "dum" });
	}

}


class Other{
	public static void main(String[] args){
		for(String s : args)
			printnb(s + " ");
	}
}
