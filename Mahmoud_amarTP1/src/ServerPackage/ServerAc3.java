package ServerPackage;

import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class ServerAc3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Crée un objet ServerSocket écoutant sur le port 1234.
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Je suis un serveur en attente de la connexion d'un client !");

        // Accepte la connexion d'un client lorsque le client se connecte.
        Socket s = ss.accept();
        System.out.println("Un client est connecté !!");

        // Récupère le flux d'entrée du socket pour lire les données du client.
        InputStream is = s.getInputStream();
        int a = is.read(); // Lit le premier entier a.
        int op = is.read(); // Lit le code d'opération (1 pour addition, 2 pour soustraction, 3 pour multiplication, 4 pour division).
        int b = is.read(); // Lit le deuxième entier b.

        int res = 0; // Initialisation de la variable de résultat.

        // Effectue l'opération mathématique en fonction du code d'opération.
        switch (op) {
            case 1:
                res = a + b;
                break;
            case 2:
                res = a - b;
                break;
            case 3:
                res = a * b;
                break;
            case 4:
                res = a / b;
                break;
        }

        // Affiche le résultat de l'opération effectuée.
        if (op == 1) {
            System.out.println("Le client a envoyé l'opération suivante : " + a + " + " + b + " = " + res);
        } else if (op == 2) {
            System.out.println("Le client a envoyé l'opération suivante : " + a + " - " + b + " = " + res);
        } else if (op == 3) {
            System.out.println("Le client a envoyé l'opération suivante : " + a + " * " + b + " = " + res);
        } else if (op == 4) {
            System.out.println("Le client a envoyé l'opération suivante : " + a + " / " + b + " = " + res);
        }

        // Récupère le flux de sortie du socket et envoie le résultat au client.
        OutputStream out = s.getOutputStream();
        out.write(res);

        // Ferme la connexion avec le client en fermant le socket.
        s.close();

        // Ferme le serveur en fermant le ServerSocket.
        ss.close();
    }
}
