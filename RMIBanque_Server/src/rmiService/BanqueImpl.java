package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import metier.Compte;

public class BanqueImpl extends UnicastRemoteObject implements IBanque  {

	private static final long serialVersionUID = 1L;

	private List<Compte> listeComptes;
	public BanqueImpl() throws RemoteException {
		super();
		 listeComptes = new ArrayList<>();
		
	}

	@Override
	public String CreerCompte(Compte c) throws RemoteException {
//		
		 listeComptes.add(c);
		return "Compte créé avec succès. "+c.toString() ;
	}

	@Override
	public String GetInfoCompte(int code) throws RemoteException {
		if(code <= listeComptes.size()) {
		if(listeComptes.get(code-1) != null) {
			return listeComptes.get(code-1).toString();
		}
		}
		return "compte n'est pas valide.";
		
	}

}
