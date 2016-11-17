package be.geertvanderpijpen.thinkinginjava.exercises.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Alert {
	public void alert() {}
}

class GreenAlert extends Alert {
	@Override
	public void alert() {
		print("Green Alert");
	}
}

class YellowAlert extends Alert {
	@Override 
	public void alert() {
		print("Yellow Alert");
	}
}

class RedAlert extends Alert {
	@Override 
	public void alert() {
		print("Red Alert");
	}
}

class StarShip {
	private Alert alert = new YellowAlert();
	
	public void augmentAlert() {
		alert = new RedAlert();
	}
	
	public void showAlert() {
		alert.alert();
	}
}

public class StarShipTravel {

	public static void main(String[] args) {
		StarShip ship = new StarShip();
		ship.showAlert();
		ship.augmentAlert();
		ship.showAlert();
	}

}
