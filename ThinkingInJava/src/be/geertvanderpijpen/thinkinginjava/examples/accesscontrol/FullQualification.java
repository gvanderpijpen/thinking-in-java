package be.geertvanderpijpen.thinkinginjava.examples.accesscontrol;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows that a class can be used by its fully qualified name without using the import statemetn<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class FullQualification {

	public static void main(String[] args) {
		java.util.ArrayList list = new java.util.ArrayList();
	}

}
