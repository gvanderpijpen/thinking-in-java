package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.util.*;



public class RandomChars {

	private Random rand = new Random(47);
	
	public char next(){
		return (char)(rand.nextInt(26) + 'a');
	}

	public static void main(String[] args) {
		RandomChars rc = new RandomChars();
		for(int i = 0; i < 7; i++)
			printnb(rc.next() + " ");
	}

}
