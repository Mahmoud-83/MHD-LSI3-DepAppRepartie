package ClientPackage;

import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import java.util.Scanner;


public class ClientAc3 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // Crée un objet Socket pour se connecter au serveur localhost sur le port 1234.
        Socket s = new Socket("localhost", 1234);
        System.out.println("Je suis un client connecté !");

        // Crée un objet Scanner pour lire l'entrée utilisateur depuis la console.
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de fournir le premier entier.
        System.out.print("Donnez un entier : ");
        int a = scanner.nextInt();

        // Demande à l'utilisateur de choisir une opération (1 pour addition, 2 pour soustraction, 3 pour multiplication, 4 pour division).
        System.out.println("Choisissez l'une des opérations :");
        System.out.println("1) +");
        System.out.println("2) -");
        System.out.println("3) *");
        System.out.println("4) /");
        int op = scanner.nextInt();
        System.out.println("Vous avez choisi : " + op);

        // Demande à l'utilisateur de fournir le deuxième entier.
        System.out.print("Donnez le deuxième entier : ");
        int b = scanner.nextInt();

        // Récupère le flux de sortie du socket pour envoyer les données au serveur.
        OutputStream out = s.getOutputStream();

        // Envoie les trois valeurs (entiers a et b, code d'opération op) au serveur.
        out.write(a);
        out.write(op);
        out.write(b);

        // Récupère le flux d'entrée du socket pour recevoir la réponse du serveur.
        InputStream is = s.getInputStream();
        int res = is.read(); // Lit la réponse du serveur.

        // Affiche la réponse reçue du serveur.
        System.out.println("Le résultat retourné par le serveur est : " + res);

        // Ferme la connexion avec le serveur en fermant le socket.
        s.close();
    }
}
