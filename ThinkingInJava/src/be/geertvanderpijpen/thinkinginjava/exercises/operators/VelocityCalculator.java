package be.geertvanderpijpen.thinkinginjava.exercises.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition <br> 
 * Calculates velocity based on a constant distance and a constanttime<br>
 * Distance and time are constant (static) class member fields<br>
 * So no other values are possible without recompilation<br>
 * 
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class VelocityCalculator {

	private static double DISTANCE = 300.143;
	private static double TIME =  3.345;
	public static void main(String[] args) {
		double velocity = DISTANCE / TIME;
		print("Distince is " + VelocityCalculator.DISTANCE + " km. ");
		print("Time is " + VelocityCalculator.TIME + " hours");
		print("Velocity is " + velocity + " km/hour");
		

	}

}
