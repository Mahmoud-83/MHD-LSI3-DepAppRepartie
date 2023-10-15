package ServerPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(1234);
		System.out.println("je suis un server  attend la connexion d'un client  ! ");
		
		Socket s = ss.accept();
		System.out.println("un client est connecte !!");
		
		s.close();
		ss.close();
		
		
	}

}
