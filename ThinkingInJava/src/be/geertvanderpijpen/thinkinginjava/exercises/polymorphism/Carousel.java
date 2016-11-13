package be.geertvanderpijpen.thinkinginjava.exercises.polymorphism;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Seat {
	
	void inspect() {
		print("Seat.inspect()");
		clean();
	}
	
	void clean() {
		print("Seat.clean()");
	}
}


class LeatherSeat extends Seat{
	
	@Override
	void clean() {
		print("LeatherSeat.clean()");
	}
}

public class Carousel {

	public static void main(String[] args) {
		LeatherSeat lseat = new LeatherSeat();
		lseat.inspect();
	}

}
