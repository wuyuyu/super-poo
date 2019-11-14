package com.company;


import java.util.ArrayList;
import java.util.List;
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

    // this method is to list the menu:
    public static void help() {
        System.out.println("MENU : ");
        System.out.println("Step 1 to create your character."); // creer et afficher un personnage
        System.out.println("Step 2 to display characters.");
        System.out.println("Step 3 to choice a character for list his details. ");
        System.out.println("Step 9 to exit the game. ");
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
        if (choice.equals("3")){
            return 3;
        }
        if (choice.equals("4")){
            return 4;
        }
        if (choice.equals("5")){
            return 5;
        }

        return -1;

    }



    // ici une méthode pour la creation d'un personnage avec les carecaristique par défaut
    public static Character createCharacter () {
        // enter and get the 4 "stats"

        //  enter and get the name of the character
        System.out.println("Enter the name of your character : ");
        Scanner sc = new Scanner(System.in);
        String nameCharacter = sc.next();

        // enter and get the HP value of the character
        System.out.println("Enter the healpoint of your character : ");
        Scanner scan = new Scanner(System.in);
        String healPointCharacter = scan.next();
        int hpCharacter = Integer.parseInt(healPointCharacter);

        // get the power value
        System.out.println("Enter the power of your character : ");
        Scanner sca = new Scanner(System.in);
        String powerCharacter = sca.next();
        int pcCharacter = Integer.parseInt(powerCharacter);


        // get the initiative (turn order)
        System.out.println("Enter the initiative of your character : ");
        Scanner scann = new Scanner(System.in);
        String initiativeCharacter = scann.next();
        int iniCharacter = Integer.parseInt(initiativeCharacter);

        Character characterPlayer = new Character(nameCharacter, pcCharacter, hpCharacter, iniCharacter);
        System.out.println("Your character has been created with success!");
        System.out.println(characterPlayer);

        return characterPlayer;
    }



    /* ici creer une liste pour stocker les personnages créés
    public static List<Character> ListCharacterPlayer (){
        List<Character> listCP;
        listCP = new ArrayList<>();

        listCP.add( Order.createCharacter());
        return listCP;
    }
    */



    // ici creer une méthode pour afficher tous les personnage créés(numéros des personnages affichés.
    public static void displayAllCharacters (List<Character> listCP){

        int i;
        for (i = 0; i < listCP.size() ; i++) {
            System.out.println("Index of the character : " + i);
            System.out.println(listCP.get(i));
        }
    }

    // ici une fonction pour faire fonctionner différents commandes
    public static void processCmd(int cmdNumber, List<Character> listCP){

        if(cmdNumber == 0){
            Order.help();
        }
        if(cmdNumber == 1){
            listCP.add(Order.createCharacter());
        }
        if(cmdNumber == 2){
            // display characters
            Order.displayAllCharacters (listCP);
        }

    }


}
