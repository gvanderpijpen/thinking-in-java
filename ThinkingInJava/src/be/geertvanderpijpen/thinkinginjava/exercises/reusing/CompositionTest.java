package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


class SimpleObject{
	String s;
	
	SimpleObject(){
		s = "Hi, I'm a simple object";
	}
	
	public String toString(){
		return s;
	}
}

/**
 * 
 * Part of Thinking in Java, 4th edition
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class CompositionTest {
	
	SimpleObject simple;
	int i = 10;
	
	CompositionTest(){
		simple = new SimpleObject();
	}

	public static void main(String[] args) {
		CompositionTest test = new CompositionTest();
		print(test);
	}
	
	public String toString(){
		return 
				"simple = " + simple + "\n" + 
				"i = " + i;
	}

}
