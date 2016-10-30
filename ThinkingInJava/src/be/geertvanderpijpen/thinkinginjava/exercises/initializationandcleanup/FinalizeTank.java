package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Tank{
	private boolean empty;
	Tank(boolean isEmpty){
		empty = isEmpty;
	}
	
	public void fill(){
		empty = false;
	}
	
	public void empty(){
		empty = true;
	}
	
	protected void finalize(){
		if(! empty){
			print("The tank is not empty!!");
		}
	}
}



/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Finalize demonstrated by a Tank example.<br>
 * The Tank can be empty or filled. The termination conidition must be that it is empty<br>
 * Therefore, the finalize method checks on this.<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class FinalizeTank {

	public static void main(String[] args) {
		Tank t1 = new Tank(true);
		Tank t2 = new Tank(false);
		
		t1.fill();
		t2.empty();
		
		// The first tank is now filled
		// Force the garbage collector
		System.gc();
		
		
		// There are too little objects created for the garbage collector to care about
		// Therefore, a lot of objects need to be created for the garbage collector to kick in
		for(int i=1; i < 10000000; i++){
			new Tank(false);
		}
		
		System.gc();
	}

}
