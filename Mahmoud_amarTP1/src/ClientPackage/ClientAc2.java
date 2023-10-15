package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientAc2 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // Crée un objet Socket pour se connecter au serveur localhost sur le port 1234.
        Socket s = new Socket("localhost", 1234);

        // Affiche un message pour indiquer que le client est connecté.
        System.out.println("Je suis un client connecté !");

        // Crée un objet Scanner pour lire l'entrée utilisateur depuis la console.
        Scanner scanner = new Scanner(System.in);

        // Invite l'utilisateur à entrer un entier et lit la valeur entrée.
        System.out.print("Tapez un entier x : ");
        int x = scanner.nextInt();

        // Récupère le flux de sortie du socket et envoie la valeur entière x au serveur.
        OutputStream out = s.getOutputStream();
        out.write(x);

        // Récupère le flux d'entrée du socket pour recevoir la réponse du serveur.
        InputStream is = s.getInputStream();
        int res = is.read(); // Lit un entier depuis le flux.

        // Affiche la réponse reçue du serveur.
        System.out.println("Le résultat retourné par le serveur est : " + res);

        // Ferme la connexion avec le serveur en fermant le socket.
        s.close();
    }
}
