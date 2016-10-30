package be.geertvanderpijpen.thinkinginjava.exercises.objects;

/**
 * 
 * Part of Thinking in Java, 4th edition <br>
 * This class showcases default initialization in Java <br>
 * An unitialized integer and char variable are printed <br>
 * to show the default values Java assigns <br>
 * Since only class members are initialized, the two variables are <br>
 * static class members. <br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Initialization {

	private static int uninitializedInt;
	private static char uninitializedChar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of uninitialized int : " + uninitializedInt);
		System.out.println("Value of unintiallized char : " + uninitializedChar);
		

	}

}
