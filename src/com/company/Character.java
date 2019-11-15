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

/**
 *The mother class of Thief, Warrior, Wizard.
 */
public class Character {

    private String name;
    private int damage;
    private int healPoint;
    private int initiative; //the order of passage of the characters

    /**
     * All the parameters of the default character
     * @param n The name of the character
     * @param d The damage of the character
     * @param hp The heal points of the character
     * @param init the initiative of the character
     */
    public Character(String n, int d, int hp, int init){
        this.name = n;
        this.damage = d;
        this.healPoint = hp;
        this.initiative = init;
    }

    // public method to hurt the character: take in damage and return the remaining HP.

    /**
     * The default hurt equation  for the fighting phase
     * @param hurt the damage I suffered from the opponent
     * @return the value of the heal point which remains to me
     */
    public int hurtCharacter(int hurt){
       if(hurt>0){
           this.healPoint = this.healPoint - hurt;

       }
            return this.healPoint;
    }

    /**
     * For knowing if the character his alive or dead
     * @return if the character is dead or not
     */
    private boolean isAlive (){
        if(healPoint <= 0){
            return false;
        }
        return true;
    }

    /**
     * The default damage of the default character
     * @return the default damage of the character
     */
    public int getDamage (){
        return this.damage;
    }

    /**
     * for getting the default heal point of the character
     * @return the default heal point oh the character
     */
    public int getHealPoint(){

        return this.healPoint;
    }

    /**
     * for getting the initiative value of the initiative character
     * @return the default initiative of the character
     */
    public int getInitiative(){

        return this.initiative;
    }

    /**
     * For getting the name of the character
     * @return the name  of the character
     */
    public String getName(){
        return this.name;
    }

    public boolean getIsAlive(){
        return this.isAlive();
    }

    // The class overrides the toString method used in Java to display character information
    /**
     * The class overrides the toString method used in Java to display character information
     * @return
     */
    public String toString() {
        return "Name: " + this.name + ", HP:" +this.healPoint + ", initiative:"  +this.initiative+ ", Damage:"+ this.damage;
    }


}
