package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.BanqueImpl;


public class Server {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			BanqueImpl banque = new BanqueImpl();
			System.out.println("create new register with seccussfly ! : "+banque.toString());
			
			// Enregistre l ’objet sous le nom "Convertie" auprès de rmiregistry
			Naming.rebind("rmi://localhost:1099/BanqueService",banque);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
