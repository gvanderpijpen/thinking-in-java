package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Smell {
	private int refCount = 0;
	private static long counter = 0;
	private final long id = counter++;
	
	public Smell() {
		print("Currently " + this);
	}
	
	public void addRef() {
		refCount++;
		print("Currently " + this);
	}
	
	
	@Override 
	public String toString() {
		return "Smell of level " + refCount;
	}
	
	public void dispose() {
		if(--refCount == 0) 
			print("Disposing " + this);
	}

}
