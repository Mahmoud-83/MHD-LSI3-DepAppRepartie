package ServerPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAc2 {

    public static void main(String[] args) throws IOException {
    	
        // Crée un serveur socket qui écoute sur le port 1234.
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Je suis un serveur en attente de la connexion d'un client !");
        
        // Attends qu'un client se connecte et accepte la connexion.
        Socket s = ss.accept();
        System.out.println("Un client est connecté !!");

        // Obtient le flux d'entrée du socket pour recevoir des données du client.
        InputStream is = s.getInputStream();
        int val = is.read(); // Lit un entier envoyé par le client.

        // Effectue une opération simple : multiplication de l'entier reçu par 5.
        int mult = val * 5;

        // Obtient le flux de sortie du socket pour envoyer des données au client.
        OutputStream out = s.getOutputStream();
        out.write(mult); // Envoie le résultat de la multiplication au client.

        // Ferme la connexion du client et le serveur socket.
        s.close();
        ss.close();
    }
}

