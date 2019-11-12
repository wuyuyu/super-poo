package com.company;
import java.util.*;

public class Order {
/*
    Story #2 : Menu de commandes
    En tant qu'étudiant de la Coding Factory,
    Je veux créer un menu en ligne de commande Afin de pouvoir contrôler mon application
    Critères d'acceptation :
    Création d'une classe avec des méthodes statiques pour la gestion de commandes
    Ajout d'une commande d'aide (qui affiche les commandes possibles)
    Ajout d'une commande pour quitter l'application
    Affichage de la liste des commandes si la commande tapée est invalide
    Tous les éléments du code et les commentaires sont en anglais Documentation du projet dans le code (JavaDoc)
    Réalisation d'un diagramme de classe de l'application
    Archivage sous Git du livrable de la story (code + diagramme de classe)
        */

    public static void help() {
        System.out.println("HELP ....");

    }
    

    public static int getUserChoice(){

        // affichez un message
        // instancier le scanner
        // lire la ligne de l'user

        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        // tester la valezur entree par le user
        // si elle est correcte on renvoie la valeur (int)
        // si elle est incorrecte on renvoie -1

        if ( choice.equals("1") ){
            return 1;
        }

        return -1;

    }

}
