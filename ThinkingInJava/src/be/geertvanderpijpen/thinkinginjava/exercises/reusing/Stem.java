package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Component1 {
	Component1(int i){
		print("Component1(int)");
	}
}

class Component2 {
	Component2(int i) {
		print("Component2(int)");
	}
}

class Component3 {
	Component3(int i){
		print("Component3(int)");
	}
}

class Root {
	private Component1 c1;
	private Component2 c2; 
	private Component3 c3;
	
	Root(int i){
		print("Root(int)");
		c1 = new Component1(1);
		c2 = new Component2(1);
		c3 = new Component3(1);
	}
}

public class Stem extends Root{
	private Component1 c12;
	private Component2 c22;
	private Component3 c32;
	
	Stem(int i){
		super(1);
		print("Stem(int)");
		c12 = new Component1(1);
		c22 = new Component2(1);
		c32 = new Component3(1);
	}
	
	
	public static void main(String[] args){
		Stem s = new Stem(1);
	}

}
