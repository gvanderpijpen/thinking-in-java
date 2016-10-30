package be.geertvanderpijpen.thinkinginjava.exercises.operators;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Very basic class to represent dogs based on their name and the noise they make<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
class Dog{
	/**
	 * The name of the dog
	 */
	String name;
	
	/**
	 * The barking sound of the dog
	 */
	String says;
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Creates 2 {@link Dog} objects with different names and barking sounds and prints both their name ({@link Dog#name}) and barking sound ({@link Dog#says})<br>
 * A third {@link Dog} object is created and assigned to the first {@link Dog} instance then and references are compared using operators and the equals method<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class DogPlayer {

	public static void main(String[] args) {
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		
		spot.name = "spot";
		spot.says = "Ruff!!";
		
		scruffy.name = "scruffy";
		scruffy.says = "Wurf!!";
		
		print(spot.name + " says " + spot.says);
		print(scruffy.name + " says " + scruffy.says);
		
		Dog spotClone = spot;
		printnb("spot == scruffy : ");
		print(spot == scruffy);
		printnb("spot == spotClone : ");
		print(spot == spotClone);
		printnb("scruffy == spotClone : ");
		print(scruffy == spotClone);
		printnb("spot.equals(scruffy) : ");
		print(spot.equals(scruffy));
		printnb("spot.equals(spotClone) : ");
		print(spot.equals(spotClone));
		printnb("scruffy.equals(spotClone) : ");
		print(scruffy.equals(spotClone));
		
	}

}
