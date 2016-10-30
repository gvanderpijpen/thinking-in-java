package be.geertvanderpijpen.thinkinginjava.examples.operators;

import java.util.Random;
import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the use of bitwise operators in Java<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class BitManipulation {

	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt();
		int j = rand.nextInt();
		
		printBinaryInt("-1", -1);
		printBinaryInt("+1", +1);
		int maxpos=2147483647;
		printBinaryInt("maxpos", maxpos);
		int maxneg=-2147483648;
		printBinaryInt("maxneg", maxneg);
		printBinaryInt("i", i);
		printBinaryInt("~i", ~i);
		printBinaryInt("-i", -i);
		printBinaryInt("j", j);
		printBinaryInt("i & j", i & j);
		printBinaryInt("i | j", i | j);
		printBinaryInt("i ^ j", i ^ j);
		printBinaryInt("i << 5", i << 5);
		printBinaryInt("i >> 5", i >> 5);
		printBinaryInt("(~i) >> 5", (~i) >> 5);
		printBinaryInt("i >>> 5", i >>> 5);
		printBinaryInt("(~i) >>> 5", (~i) >>> 5);
		
		long l = rand.nextLong();
		long m = rand.nextLong();
		printBinaryLong("-1L", -1L);
		printBinaryLong("+1L", +1L);
		long ll =  Long.MAX_VALUE;
		printBinaryLong("maxpos", ll);
		long lln = Long.MIN_VALUE;
		printBinaryLong("maxneg", lln);
		printBinaryLong("l", l);
		printBinaryLong("~l", ~l);
		printBinaryLong("-l", -l);
		printBinaryLong("m", m);
		printBinaryLong("l & m", l & m);
		printBinaryLong("l | m", l | m);
		printBinaryLong("l ^ m", l ^ m);
		printBinaryLong("l << 5", l << 5);
		printBinaryLong("l >> 5", l >> 5);
		printBinaryLong("(~l) >> 5", (~l) >> 5);
		printBinaryLong("l >>> 5", l >>> 5);
		printBinaryLong("(~l) >>> 5", (~l) >>> 5);
		

	}
	
	
	static void printBinaryInt(String s, int i){
		print(s + ", int: " + i + ", binary: \n" + Integer.toBinaryString(i));
	}
	
	static void printBinaryLong(String s, long l){
		print(s + ", long: " + l + ", binary: \n" + Long.toBinaryString(l));
	}

}
