package be.geertvanderpijpen.thinkinginjava.examples.operators;

import java.util.Random;
import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the different mathematical operators in Java<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class MathOps {

	public static void main(String[] args) {
		// Create a seeded random number generator
		Random rand = new Random(47);
		int i, j, k;
		// Choose values from 1 to 100
		j = rand.nextInt(100) + 1; 
		print ("j : " + j);
		k = rand.nextInt(100) + 1;
		print ("k : " + k);
		i = j + k; 
		print ("j + k : " + i);
		i = j - k;
		print("j - k : " + i);
		i =  k / j;
		print("k / j : " + i);
		i = k * j;
		print("k * j : " + i);
		i = k % j; 
		print ("k % j : " + i);
		
		// Floating-point number tests
		float u, v, w; // applies to doubles, too 
		v = rand.nextFloat();
		print("v : " + v);
		w = rand.nextFloat();
		print("w : " + w);
		u = v + w; 
		print("v + w : " + u);
		u = v - w;
		print("v - w : " + u);
		u = v * w;
		print("v * w : " + u);
		u = v / w;
		print("v / w : " + u);
		
		// The following also works for char, 
		// byte, short, int, long and double
		u += v;
		print("u += v : " + u);
		u -= v;
		print("u -= v : " + u);
		u *= v; 
		print("u *= v : " + u);
		u /= v;
		print("u /= v : " + u);
		
		
	}

}
