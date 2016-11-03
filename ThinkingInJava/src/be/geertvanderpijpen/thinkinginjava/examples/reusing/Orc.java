package be.geertvanderpijpen.thinkinginjava.examples.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


class Villain {
	private String name;
	protected void set(String nm){
		name = nm;
	}
	
	public Villain(String name){
		this.name = name;
	}
	
	public String toString(){
		return "I am a Villain and my name is " + name;
	}
}

/**
 * 
 * @author gvanderpijpen
 * Demonstrates the protected keyword
 *
 */
public class Orc extends Villain{
	private int orcNumber;
	
	public Orc(String name, int orcNumber){
		super(name);
		this.orcNumber = orcNumber;
	}
	
	public void change(String name, int orcNumber){
		set(name); // Available because it's protected
		this.orcNumber = orcNumber;
	}
	
	public String toString(){
		return "Orc " + orcNumber + ": " + super.toString();
	}
	

	public static void main(String[] args) {
		Orc orc = new Orc("Limburger", 12);
		print(orc);
		orc.change("Bob", 17);
		print(orc);
	}

}
