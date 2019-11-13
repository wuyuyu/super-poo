package com.company;


import java.util.Scanner;

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
            System.out.println("Step 1 to display characters"); // creer et afficher un personnage
            System.out.println("Step 2 to exit the game ");

            System.out.println("Step 0 for help ....");

    }
    
    public static int getUserChoice(){

        // affichez un message
        // instancier le scanner
        // lire la ligne de l'user

        System.out.println("Entrez une commande : ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        // tester la valezur entree par le user
        // si elle est correcte on renvoie la valeur (int)
        // si elle est incorrecte on renvoie -1

        if ( choice.equals("0") ){
            return 0;
        }
        if ( choice.equals("1") ){
            return 1;
        }
        if (choice.equals("2")){
            return 2;
        }
        return -1;

    }

    public static void processCmd(int cmdNumber){

        if(cmdNumber == 0){
            Order.help();
        }
        if(cmdNumber == 1){
            // display characters



        }

    }


}
