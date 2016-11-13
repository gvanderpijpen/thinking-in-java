package be.geertvanderpijpen.thinkinginjava.examples.polymorphism.shape;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Shape {
	
	public void draw() {}
	public void erase() {}
	public void refresh() {
		print("Shape.refresh()");
	}

}
