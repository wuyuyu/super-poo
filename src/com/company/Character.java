package com.company;


/*
Creating a class for the default archetype
The class has private attributes for name, damage, health, and initiative
The class has public methods to retrieve the values ​​of the attributes (getters), to recover the strike force (damage), to hurt the character (it receives damages)
The class overrides the toString method used in Java to display character information
All code elements and comments are in English Project documentation in code (JavaDoc)
Realization of a class diagram of the application
Archiving under Git of the deliverable of the story (code + class diagram)
 */

public class Character {

    private String name;
    private int damage;
    private int healPoint;
    private int initiative; //the order of passage of the characters

    public Character(String n, int d, int hp, int init){
        this.name = n;
        this.damage = d;
        this.healPoint = hp;
        this.initiative = init;
    }

    // public method to hurt the character: take in damage and return the remaining HP.
    public int hurtCharacter(int hurt){
       if(hurt>0){
           this.healPoint = this.healPoint - hurt;

       }
            return this.healPoint;
    }
    // method to know that the character is alive
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

    public String getName(){
        return this.name;
    }

    // The class overrides the toString method used in Java to display character information
    public String toString() {
        return "Name: " + this.name + ", HP:" +this.healPoint + ", initiative:"  +this.initiative+ ", Damage:"+ this.damage;
    }


}
