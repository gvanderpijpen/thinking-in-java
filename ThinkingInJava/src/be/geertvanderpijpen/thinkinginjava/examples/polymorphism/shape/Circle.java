package be.geertvanderpijpen.thinkinginjava.examples.polymorphism.shape;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Circle extends Shape{
	@Override
	public void draw() {
		print("Circle.draw()");
	}
	
	@Override
	public void erase() {
		print("Circle.erase()");
	}
	
	@Override
	public void refresh() {
		print("Circle.refresh()");
	}
}
