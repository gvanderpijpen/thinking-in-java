package be.geertvanderpijpen.thinkinginjava.exercises.objects;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the use of the {@link DataOnly} class<br>
 * First, the default values of the DataOnly members are printed to standard out<br>
 * Then, values are assigned to the DataOnly instance object:
 * <ul>
 * <li>i : 47
 * <li>d : 1.1
 * <li>b : false
 * </ul>
 * At last, the values of the member fieds are printed again to show the difference<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class DemonstrateDataOnly {
	
	private static DataOnly dataOnly = new DataOnly();

	public static void main(String[] args) {
		System.out.println("Value of dataOnly members:");
		System.out.println("i = " + dataOnly.i);
		System.out.println("d = " + dataOnly.d);
		System.out.println("b : " + dataOnly.b);
		
		dataOnly.i = 47;
		dataOnly.d = 1.1;
		dataOnly.b = false;

		System.out.println("Value of dataOnly members:");
		System.out.println("i = " + dataOnly.i);
		System.out.println("d = " + dataOnly.d);
		System.out.println("b : " + dataOnly.b);
		
	}

}
