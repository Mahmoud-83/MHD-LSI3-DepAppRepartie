package client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;

public class Client implements Runnable{
	
	private Socket s;
	private int clientnumber ;
	
	public Client(Socket s, int nbC) {
		this.s=s;
		this.clientnumber=nbC;
	
	}

	@Override
	public void run() {
	
		// Code de traitement du client ici
      // Vous pouvez envoyer des données au client et recevoir des données du client
		SocketAddress clientAddress = s.getRemoteSocketAddress();
        System.out.println("IP du Client " + clientnumber + ": " + clientAddress);
        OutputStream out;
		try {
			out = s.getOutputStream();
			 PrintWriter pw = new PrintWriter(out);
			 pw.println("Vous êtes le Client " + clientnumber);
			 s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		
	}

}
