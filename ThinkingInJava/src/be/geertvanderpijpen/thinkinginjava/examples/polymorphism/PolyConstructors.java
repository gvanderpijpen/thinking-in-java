package be.geertvanderpijpen.thinkinginjava.examples.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

// Constructors and polymorphism
// don't produce what you might expect


class Glyph {
	void draw() {
		print("Glyph.draw()");
	}
	
	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}


class RoundGlyph extends Glyph {
	private int radius = 1; 
	RoundGlyph(int r) {
		radius = r; 
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	@Override
	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int width = 10;
	private int height = 5;
	
	RectangularGlyph(int width, int height) {
		this.width = width;
		this.height = height;
		
		print("RectangualrGlyph.RectangularGlyph(width, height), "
				+ "widht = " + width + ", height = " + height);
	}
	
	@Override
	void draw() {
		print("RectangularGlyph.draw(), width = "
				+ width + ", height = " + height);		
	}
}



public class PolyConstructors {

	public static void main(String[] args) {
		new RoundGlyph(5);
		new RectangularGlyph(3, 4);
	}

}
