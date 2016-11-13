package be.geertvanderpijpen.thinkinginjava.examples.polymorphism.shape;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		print("Rectangle.draw()");
	}
	
	@Override
	public void erase() {
		print("Rectangle.erase()");
	}
	
	@Override
	public void refresh() {
		print("Rectangle.refresh()");
	}
	
}
