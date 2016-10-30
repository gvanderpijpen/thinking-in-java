package be.geertvanderpijpen.thinkinginjava.exercises.reusing;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class CleanserDelegation{
	private String s = "Cleanser";
	public void append(String a){
		s += a;
	}
	
	public void dilute(){
		append(" dilute() ");
	}
	
	public void apply(){
		append(" apply() ");
	}
	
	public void scrub(){
		append(" scrub() ");
	}
	
	public String toString(){
		return s;
	}
	
	public static void main(String [] args){
		CleanserDelegation x = new CleanserDelegation();
		x.dilute();
		x.apply();
		x.scrub();
		
		print(x);
		
	}
}

public class DetergentDelegation{
	
	private CleanserDelegation cleanser;
	
	public DetergentDelegation(){
		cleanser = new CleanserDelegation();
	}
	
	public void append(String a){
		cleanser.append(a);
	}
	
	public void dilute(){
		cleanser.dilute();
	}
	
	public void apply(){
		cleanser.apply();
	}
	
	// Change a method
	public void scrub(){
		append(" Detergent.scrub() ");
		cleanser.scrub(); // call base class version
	}
	
	// Add methods to the interface
	public void foam(){
		append(" foam() ");
	}
	
	public String toString(){
		return cleanser.toString();
	}

	public static void main(String[] args) {
		DetergentDelegation x = new DetergentDelegation();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class : ");
		CleanserDelegation.main(args);
	}

}
