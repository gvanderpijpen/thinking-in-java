package be.geertvanderpijpen.thinkinginjava.examples.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows the precendence rules on operators<br>
 * First, a command is executed without paranthesis (default precedence)<br>
 * After that, the same command is executed with paranthesis (enforced precedence)<br>
 * The results of both of the operations are printed <br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Precedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1, y=2, z=3;
		int a = x + y - 2/2 + z;
		int b = x + (y - 2)/(2 + z);
		
		print("a = " + a + " b = " + b);
	}

}
