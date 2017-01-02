package be.geertvanderpijpen.thinkinginjava.examples.interfaces;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

import java.io.IOException;
import java.nio.*;
import java.util.*;

// Creating an adapter with inheritance

public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
	
	private int count;
	
	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0)
			return -1;
		String result = Double.toString(this.next()) + " ";
		cb.append(result);
		return result.length();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoubles(7));
		while(s.hasNextDouble())
			printnb(s.nextDouble() + " ");
		s.close();
	}

}
