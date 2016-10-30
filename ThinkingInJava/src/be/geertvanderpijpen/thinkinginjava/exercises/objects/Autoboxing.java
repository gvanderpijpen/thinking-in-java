package be.geertvanderpijpen.thinkinginjava.exercises.objects;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates autoboxing: <br>
 * Primitive data types are automatically converted to wrapper class types when needed<br>
 * The same applies in the other way around<br>
 * The main program creates a value for every primitve type and prints the value. A wrapper class instance is created by autoboxing and the value is printed<br>
 * To complete the showcase, a primitave data type member is assigned a value by autoboxing agina and its value is printed<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=true;
		char c='k';
		byte bt=126;
		short s=2000;
		int i=578698;
		long l=23794890;
		float f=3;
		double d=4.09358098;
		
		System.out.println("boolean value b = " + b);
		System.out.println("char value c = " + c);
		System.out.println("byte value bt = " + bt);
		System.out.println("short value s = " + s);
		System.out.println("int vlaue i = " + i);
		System.out.println("float value f = " + f);
		System.out.println("double value d = " + d);
		
		System.out.println("Autoboxing to wrapper classes...");
		
		Boolean bc = b;
		Character cc = c;
		Byte btc = bt;
		Short sc = s; 
		Integer ic = i;
		Long lc = l;
		Float fc = f; 
		Double dc = d;
		
		System.out.println("Boolean value bc = " + bc);
		System.out.println("Character value cc = " + cc);
		System.out.println("Byte value btc = " + btc);
		System.out.println("Short value sc = " + sc);
		System.out.println("Integer vlaue ic = " + ic);
		System.out.println("Long vale lc = " + lc);
		System.out.println("Float value fc = " + fc);
		System.out.println("Double value dc = " + dc);
		
		System.out.println("Autoboxing back to primitives...");
		
		boolean b2=bc;
		char c2=cc;
		byte bt2=btc;
		short s2=sc;
		int i2=ic;
		long l2=lc;
		float f2=fc;
		double d2=dc;
		
		
		System.out.println("boolean value b2 = " + b2);
		System.out.println("char value c2 = " + c2);
		System.out.println("byte value bt2 = " + bt2);
		System.out.println("short value s2 = " + s2);
		System.out.println("int vlaue i2 = " + i2);
		System.out.println("long value l2 = " + l2);
		System.out.println("float value f2 = " + f2);
		System.out.println("double value d2 = " + d2);
		
		
		
		
	}

}
