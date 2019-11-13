package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 Story #4 : Création et affichage de personnages
En tant qu'étudiant de la Coding Factory,
        Je veux modifier ma liste de commandes
        Afin de pouvoir gérer la création d'un personnage
        Critères d'acceptation :
        Ajout d'une commande pour la création d'un personnage avec les caratéristiques par défaut
        Ajout d'une liste pour stocker les personnages créés
        Ajout d'une commande pour lister les personnages créés (numéros des personnages affichés)
        Ajout d'une commande pour afficher les informations d'un personnage (le numéro du personnage est requis dans cette commande)
        Tous les éléments du code et les commentaires sont en anglais Documentation du projet dans le code (JavaDoc)
        Réalisation d'un diagramme de classe de l'application
        Archivage sous Git du livrable de la story (code + diagramme de classe)
*/
public class CreateDisplayCharacters {

    // creer le constructeur de cette classe, en passant par paramètre: le numéro des personnages
    public CreateDisplayCharacters() {
        Character defaut = new Character("antoine", 100, 1000, 0);
    }
}


    /* private String
    //public void listCharaters(){
    // int i = 0;
    //while (i < number, i++){
    //System.out.println(Character);
    //}
        for (int numberCharaters = 1; numberCharaters <= 10; numberCharaters++) {

            return numberCharaters;
        }

         */