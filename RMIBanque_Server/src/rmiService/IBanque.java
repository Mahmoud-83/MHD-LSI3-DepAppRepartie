package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

import metier.Compte;

public interface IBanque extends Remote {

		String CreerCompte(Compte c) throws RemoteException;
		String GetInfoCompte(int code) throws RemoteException;
	
	
}
