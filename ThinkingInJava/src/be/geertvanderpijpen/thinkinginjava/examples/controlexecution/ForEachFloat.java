package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import java.util.Random;
import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the use of the for each operator in Java<br>
 * An array of random floats is looped and printed<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class ForEachFloat {

	public static void main(String[] args) {
		Random rand = new Random(47);
		float f[] = new float[10];
		
		for(int i=0; i < f.length; i++){
			f[i] = rand.nextFloat();
		}
		
		for(float x : f){
			print(x);
		}
	}

}
