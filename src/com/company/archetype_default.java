package com.company;


/*
story 3

En  tant qu'étudiant de la Coding Factory,
Je veux créer une première classe non statique
Afin de commencer à mettre en pratique les bases de la POO
Critères d'acceptation :
Création d'une classe pour l'archétype par défaut
La classe possède des attributs privés pour le nom, les dégâts, les points de vie et l'initiative
La classe possède des méthodes publiques pour récupérer les valeurs des attributs (getters), pour récupérer la force de frappe (dégâts), blesser le personnage (il reçoit des dégâts)
La classe surcharge la méthode toString utilisée en Java pour afficher les informations du personnage
Tous les éléments du code et les commentaires sont en anglais Documentation du projet dans le code (JavaDoc)
Réalisation d'un diagramme de classe de l'application
Archivage sous Git du livrable de la story (code + diagramme de classe)
 */

public class archetype_default {

    private String name;
    private int damage;
    private int healPoint;
    private int initiative;

    public int getDamage (){
        return this.damage;
    }
    public String toString() {
        /*
        System.out.println(this.name);
        System.out.println(this.damage);
        System.out.println(this.healPoint);
        System.out.println(this.initiative);

         */
        return "???";
    }

}
