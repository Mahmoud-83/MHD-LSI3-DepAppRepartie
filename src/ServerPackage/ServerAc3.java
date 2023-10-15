package ServerPackage;

import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class ServerAc3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket ss = new ServerSocket(1234);
		System.out.println("je suis un server  attend la connexion d'un client  ! ");
				
				Socket s = ss.accept();
				System.out.println("un client est connecte !!");
				
			InputStream is = s.getInputStream();
//			
			int a = is.read();
			int op = is.read();
			int b = is.read();
			int res = 0;
			
			switch(op) {
			case 1: res = a+b;
				break;
			case 2: res = a-b;
				break;
			case 3: res = a*b;
				break;
			case 4: res = a/b;
				break;
			}
			
			if (op ==1) {
				System.out.println("le client a envoye l'operation suivant "+a+" + "+b+" = "+res);
				
			}
			if (op ==2) {
				System.out.println("le client a envoye l'operation suivant "+a+" - "+b+" = "+res);
				
			}
			if (op ==3) {
				System.out.println("le client a envoye l'operation suivant "+a+" * "+b+" = "+res);
				
			}
			if (op ==4) {
				System.out.println("le client a envoye l'operation suivant "+a+" / "+b+" = "+res);
				
			}
			
			
			
			OutputStream out = s.getOutputStream();
			out.write(res);
				
				s.close();
				ss.close();
	}

}
