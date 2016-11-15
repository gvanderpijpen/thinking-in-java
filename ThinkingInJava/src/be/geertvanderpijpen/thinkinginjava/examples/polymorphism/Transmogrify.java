package be.geertvanderpijpen.thinkinginjava.examples.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

// Dynamically changing the behavior of an object via composition
// (The "State" design pattern

class Actor {
	public void act() {}
}

class HappyActor extends Actor {
	public void act() {
		print("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		print("SadActor");
	}
}

class Stage {
	private Actor actor = new HappyActor();
	public void change() {
		actor = new SadActor();
	}
	
	public void performPlay() {
		actor.act();
	}
}

public class Transmogrify {

	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}

}
