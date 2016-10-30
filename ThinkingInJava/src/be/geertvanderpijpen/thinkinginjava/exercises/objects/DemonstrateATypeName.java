package be.geertvanderpijpen.thinkinginjava.exercises.objects;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * This class demonstrates the use of the dummy class {@link ATypeName}<br>
 * A new instance of ATypeName is created in the main program<br>
 * In order to make things more interesting, the static instance of {@link ATypeName} is printed to standard out <br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class DemonstrateATypeName {

	private static ATypeName aTypeNameInstance = new ATypeName();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the printed representation of aTypeNameInstance : " + aTypeNameInstance);

	}

}
