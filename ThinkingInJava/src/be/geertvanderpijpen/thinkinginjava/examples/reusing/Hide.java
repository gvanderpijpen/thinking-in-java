package be.geertvanderpijpen.thinkinginjava.examples.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

// Overloading a base-class method name in a derived class does not override the base-class versions

class Homer {
	char doh(char c){
		print("doh(char)");
		return 'd';
	}
	
	float doh(float f){
		print("doh(float)");
		return 1.0f;
	}
}

class Milhouse{}

class Bart extends Homer {
	void doh(Milhouse m){
		print("doh Milhouse");
	}
}

class Lisa extends Homer {

	/* Does not compile
	@Override
	void doh (Milhouse m){
		print("doh Milhouse");
	}
	
	*/
	
	@Override
	char doh(char c) {
		print("Lisa doh(char)");
		return 'l';
	}
}

public class Hide {

	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
		
		Lisa l = new Lisa();
		l.doh('g');
	}

}
