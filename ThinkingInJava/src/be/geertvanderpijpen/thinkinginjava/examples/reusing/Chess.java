package be.geertvanderpijpen.thinkinginjava.examples.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Game{
	Game(int i){
		print("Game constructor");
	}
}


class BoardGame extends Game {
	BoardGame(int i){
		super(i);
		print("BoardGame constructor");
	}
}


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates how to apply inheritence when there are no default constructors<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Chess extends BoardGame {

	Chess(){
		super(11);
		print("Chess constructor");
	}
	
	public static void main(String[] args) {
		Chess x = new Chess();
	}

}
