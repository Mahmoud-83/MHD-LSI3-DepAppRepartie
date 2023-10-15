package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientAc2 {

	public static void main (String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("localhost",1234);
		System.out.println("je suis un  client connecte ! ");

		Scanner scaner = new Scanner(System.in);	
		
		System.out.print("taper un entier x : ");
		int x = scaner.nextInt();
		OutputStream out = s.getOutputStream();
		out.write(x);
		
		InputStream is = s.getInputStream();
		int res=  is.read();
		
		System.out.println("la resultat retourner par le server est : "+res);
		
		s.close();
	}
}
