package be.geertvanderpijpen.thinkinginjava.examples.innerclasses;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

// Holds a sequence of objects

interface Selector {
	boolean end();
	Object current();
	void next();
}



public class Sequence {
	
	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
		
	}
	
	private class SequenceSelector implements Selector {
		private int i = 0;
		
		public boolean end() {
			return (i == items.length);
		}
		
		public Object current() {
			return items[i];
		}
		
		public void next() {
			if(i < items.length)
				i++;
		}
		
		public Sequence getSequence() {
			return Sequence.this;
		}
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public void iterate() {
		Selector selector = new SequenceSelector();
		while(!selector.end()){
			printnb(selector.current() + " ");
			selector.next();
		}
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()){
			printnb(selector.current() + " ");
			selector.next();
		}
	}

}
