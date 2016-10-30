package be.geertvanderpijpen.thinkinginjava.examples.objects;


/**
 * Part of Thinking in Java, 4th edition<br>
 * This class shows all system properties on standard out <br>
 * At last, the user name and Java library path are shown <br>
 * @author Geert Vanderpijpen
 * @version 1.0

 */
public class ShowProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));

	}

}
