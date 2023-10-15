package ServerPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAc2 {

	public static void main(String[] args) throws IOException {

		
		ServerSocket ss = new ServerSocket(1234);
System.out.println("je suis un server  attend la connexion d'un client  ! ");
		
		Socket s = ss.accept();
		System.out.println("un client est connecte !!");
		
		InputStream is = s.getInputStream();
		int val = is.read();
		
		int mult = val*5;
		
		OutputStream out = s.getOutputStream();
		out.write(mult);
		
		s.close();
		ss.close();
		
	}

}
