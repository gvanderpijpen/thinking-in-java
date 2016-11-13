package be.geertvanderpijpen.thinkinginjava.examples.polymorphism.shape;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Triangle extends Shape {
	
	@Override
	public void draw() {
		print("Triangle.draw()");
	}
	
	@Override
	public void erase() {
		print("Triangle.erase()");
	}
	
	@Override
	public void refresh() {
		print("Triangle.refresh()");
	}

}
