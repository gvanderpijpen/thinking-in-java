package be.geertvanderpijpen.thinkinginjava.exercises.accesscontrol.connections;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;



public class ConnectionManager {
	
	private static Connection[] connections = new Connection[10];
	private static int aantal = 0;
	
	private ConnectionManager(){}
	
	public static Connection getNewConnection(){
		if(aantal >= 10)
			return null;
		connections[aantal] = Connection.createConnection();
		aantal++;
		return connections[(aantal-1)];
	}
	

}
