package be.geertvanderpijpen.thinkinginjava.examples.polymorphism.shape;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Square extends Shape {
	
	@Override
	public void draw() {
		print("Square.draw()");
	}
	
	@Override
	public void erase() {
		print("Square.erase()");
	}
	
	@Override
	public void refresh() {
		print("Square.refresh()");
	}

}
