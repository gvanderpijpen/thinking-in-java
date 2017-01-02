package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.io.IOException;
import java.nio.*;
import java.util.*;


public class AdaptedRandomChars extends RandomChars implements Readable {
	private int count;
	
	public AdaptedRandomChars(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0)
			return -1;
		cb.append(next() + " ");
		return 2;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomChars(7));
		while(s.hasNext())
			printnb(s.next() + " ");
		s.close();
		
	}

}
