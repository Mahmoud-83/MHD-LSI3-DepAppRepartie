package rmiserver;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.ConvertImpl;

public class Server {

	public static void main(String[] args) {
	try {
		
		LocateRegistry.createRegistry(1099);
		ConvertImpl od = new ConvertImpl();
		System.out.println(od.toString());
		
		// Enregistre l ’objet sous le nom "Convertie" auprès de rmiregistry
		Naming.rebind("rmi://localhost:1099/BK",od);
		
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
