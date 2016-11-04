package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.security.SecureRandom;
import java.math.BigInteger;

public class StaticFinal {
	
	private static SecureRandom random = new SecureRandom();	
	
	private static String generateId() {
		return new BigInteger(130, random).toString(32);
	}
	
	public final String name = generateId();
	public static final String generalName = generateId(); 

	public static void main(String[] args) {
		StaticFinal sf = new StaticFinal();
		print("sf.name = " + sf.name);
		print("sf.generalName = " + sf.generalName);
		
		StaticFinal sf2 = new StaticFinal();
		print("sf2.name = " + sf2.name);
		print("sf2.generalName = " + sf2.generalName);

	}

}
