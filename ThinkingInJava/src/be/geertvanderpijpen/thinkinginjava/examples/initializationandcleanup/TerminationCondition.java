package be.geertvanderpijpen.thinkinginjava.examples.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	
	void checkIn() {
		checkedOut = false;
	}
	
	protected void finalize() throws Throwable{
		try{
			if(checkedOut)
				print("Error : checked out");
		}
		finally{
			super.finalize();
		}
		
	}
}

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Use finalize to detect an object that has not been properly cleaned up<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		
		// Proper cleanup
		novel.checkIn();
		
		// Drop the reference, forget to cleanup
		new Book(true);
		
		// Force garbage collection and finalization
		System.gc();

	}

}
