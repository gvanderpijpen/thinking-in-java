package be.geertvanderpijpen.thinkinginjava.exercises.accesscontrol;

import be.geertvanderpijpen.thinkinginjava.exercises.accesscontrol.connections.ConnectionManager;
import be.geertvanderpijpen.thinkinginjava.exercises.accesscontrol.connections.Connection;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class ConnectionsTest {

	public static void main(String[] args) {
		for(int i=0; i<15; i++){
			Connection connectie = ConnectionManager.getNewConnection();
			print(connectie);
		}
	}

}
