package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class Amphibian {
	public Amphibian(){
		print("Amphibian constructor");
	}
	
	public String toString(){
		return "This is an Amphibian";
	}
	
	static void boil(Amphibian a){
		a.swim();
		a.crawl();
		print("Boiling Amphibian");
	}
	
	public void swim(){
		print("Amphibian.swim()");
	}
	
	public void crawl(){
		print("Amphibian.crawl()");
	}
}

public class Frog extends Amphibian{

	public Frog(){
		print("Frog constructor");
	}
	public static void main(String[] args) {
		Frog frog = new Frog();
		
		print(frog);
		
		frog.swim();
		frog.crawl();
		
		Amphibian.boil(frog);
	}
	
	public String toString(){
		return "This is a Frog";
	}
	
	public void swim() {
		print("Frog.swim()");
	}
	
	public void crawl() {
		print("Frog.crawl()");
	}


}
