package com.company;

public class Thief extends Character{

    /**
     * floating value for the dodge probability between 0.0 and 1.0
     */
    private float dodge;
    private int criticalDamage;


    /**
     *Create a character thief who inherits the class Character
     * @param n name of the thief
     * @param d damage of the thief
     * @param hp heal points of the thief
     * @param init initiative of the thief
     * @param dod floating value for the dodge proba between 0 and 1.0. If it exceeds 1.0 it will be saturated to 1.0
     */
    public Thief(String n, int d, int hp, int init, float dod) {
        super(n, d, hp, init);
        this.dodge = dod;
    }

// ajoute propriété privée pour le sdéghats critiques (e t la mathode publique pour la recuperer).
// créer une probabilité d'appliquer des degats des dégats critiqueS. Dans ce cas, il double els dégats.
//le sdegats critiques ne peuvent pas être appliqués sur deux attaques conséctuives.
    // créer une probab pour esquyiver totalement une attaque.
    // getEnnemyDamage pour passer en paramettre

    /**
     * The dodge probability of the thief
     * @param hurt the damage I suffered from the opponent
     * @return if the thief dodge or not
     */
    public int hurtCharacter(int hurt) {
        // lance un dé : regarde si le lancer est plus grand/petit ue la proba d'(esquive du voleur
        if (Math.random() >=  dodge){
            hurt = 0;
        }
        return hurt;
    }


    /**
     * A thief has a probability of give a critical damage, if he used this he twice his damage. That can't be used two times in a row
     * @return value of the damage with the critical hit
     */
    public int getDamage(){
        if (Math.random()*100 >= super.getDamage()) {
            criticalDamage = super.getDamage() * 2;
        }
        else {
            criticalDamage = super.getDamage();
        }
        return criticalDamage;
    }


    public float getDodge(){
        return this.dodge;
    }
    public int getCriticalDamage(){
        return this.criticalDamage;
    }

    /**
     * The class overrides the toString method used in Java to display character information
      * @return
     */
    public String toString(){
        return super.toString() + ", dodge: " + this.dodge;
    }
}
