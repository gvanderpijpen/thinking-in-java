package be.geertvanderpijpen.thinkinginjava.exercises.objects;
import be.geertvanderpijpen.thinkinginjava.exercises.objects.Incrementable;
import be.geertvanderpijpen.thinkinginjava.exercises.objects.StaticTest;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Main program that demonstrates how {@link Incrementable#increment()} is able to increment {@link StaticTest#i}<br>
 * First, the initial value of {@link StaticTest#i} is printed<br>
 * Then the {@link Incrementable#increment()} method is called a couple of times<br>
 * With in between a print of the value.<br>
 * Several object instances of the StaticTest class are created.<br>
 * The i value is printed for all of those objects to demonstrate that they all refer to the same field instance<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class DemonstrateIncrementable {

	private static StaticTest a = new StaticTest();
	private static StaticTest b = new StaticTest();
	private static StaticTest c = new StaticTest();
	private static StaticTest d = new StaticTest();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest.printValue();
		for(int i=0; i<50; i++){
			Incrementable.increment();
			StaticTest.printValue();
		}
		System.out.println("value of i for object a : " + a.i);
		System.out.println("value of i for object b : " + b.i);
		System.out.println("value of i for object c : " + c.i);
		System.out.println("value of i for object d : " + d.i);
		
		

	}
	
	

}
