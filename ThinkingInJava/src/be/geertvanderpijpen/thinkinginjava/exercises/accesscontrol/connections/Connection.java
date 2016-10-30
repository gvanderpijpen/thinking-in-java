package be.geertvanderpijpen.thinkinginjava.exercises.accesscontrol.connections;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.print;

public class Connection{
	private Connection(){
		print("Connection constructor");
	}
	
	static Connection createConnection(){
		return new Connection();
	}
	
}
