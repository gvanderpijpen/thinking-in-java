package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;



/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates a simple use for the this keywoard: as return in a member method<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Leaf {
	int i = 0; 
	Leaf increment(){
		i++;
		return this;
	}
	
	void print(){
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}

}
