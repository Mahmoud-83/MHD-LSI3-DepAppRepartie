package ClientPackage;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		// avant la connecte du client 
		
		
		System.out.println("je suis un client non encore connecte !");
		
		// on peut changer l'ip par 127.0.0.1 == localhost 
		
		// 1- on  a tester l'address avec localhost est il est connecte avec seccus
		
		//Socket s = new Socket("localhost",1234);
		
		// 2-  on  a tester l'address avec 127.0.0.q est il est connecte avec seccus

		Socket s = new Socket("127.0.0.1",1234);
		// apres la connection du client par un server 
		System.out.println("je suis un client connecte !");
		
		s.close();
	}

}
