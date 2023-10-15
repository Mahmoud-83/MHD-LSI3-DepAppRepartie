package ClientPackage;

import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import java.util.Scanner;


public class ClientAc3 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("localhost",1234);
		System.out.println("je suis un  client connecte ! ");

		Scanner scaner = new Scanner(System.in);	
		
		System.out.print("donner  un entier  : ");
		int a = scaner.nextInt();
		System.out.println("choisie l'un des operations : \n  1) + \n 2) - \n 3) * \n 4) / ");
		
		int op = scaner.nextInt();
		System.out.println("vous avez choisier : "+op);
//		
		System.out.print("donner le dexuiem entier  : ");
        int b =scaner.nextInt();  
//        
//     
		OutputStream out = s.getOutputStream();
//		
		out.write(a);
		out.write(op);
		out.write(b);
		
//		
//		
		InputStream is = s.getInputStream();
		int res=  is.read();
		
		System.out.println("la resultat retourner par le server est : "+res);
		
		s.close();
	}

}
