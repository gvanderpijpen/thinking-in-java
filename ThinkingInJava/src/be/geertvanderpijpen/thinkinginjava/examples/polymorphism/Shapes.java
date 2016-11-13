package be.geertvanderpijpen.thinkinginjava.examples.polymorphism;

import be.geertvanderpijpen.thinkinginjava.examples.polymorphism.shape.*;


/**
 * 
 * @author gvanderpijpen
 * Polymorphism with Shapes
 *
 */
public class Shapes {
	
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[50];
		// Fill up the array with Shapes
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		
		// Make polymorphic method calls
		for(Shape shp : s) {
			shp.draw();
			shp.refresh();
		}
	}

}
