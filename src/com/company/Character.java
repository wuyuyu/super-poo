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

public class Character {

    private String name;
    private int damage;
    private int healPoint; // point de vie
    private int initiative; // l'ordre de passage des personnages

    public Character(String n, int d, int hp, int init){
        this.name = n;
        this.damage = d;
        this.healPoint = hp;
        this.initiative = init;
    }

    // methode public pour blesser le personnage: prendre en parametre les dégats et retourner le HP restant.
    public int hurtCharacter(int hurt){
        hurt = this.damage;
        this.healPoint = this.healPoint - hurt;
        return this.healPoint;
    }


    //methode pour savoir le personnge est en vie
    private boolean isAlive (){
        if(healPoint <= 0){
            return false;
        }
        return true;
    }

    public int getDamage (){
        return this.damage;
    }
    public int getHealPoint(){
        return this.healPoint;
    }
    public int getInitiative(){
        return this.initiative;
    }


// La classe surcharge la méthode toString utilisée en Java pour afficher les informations du personnage
    public String toString() {
        return "Name: " + this.name + ", HP:" +this.healPoint + ", initiative:"  +this.initiative;
    }


}
