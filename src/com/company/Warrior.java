package com.company;

import java.util.Scanner;

public class Warrior extends Character {

    private int shield;

    /**
     *Create a character warrior who inherits the class Character
     * @param n the name of the warrior
     * @param d the damage of the warrior
     * @param hp the heal point of the warrior
     * @param init the initiative value of the warrior
     * @param sh the shield value of the warrior who attenuate the damage
     */
    public Warrior(String n, int d, int hp, int init, int sh) {
        super(n, d, hp, init);
        this.shield = sh;
    }

    /**
     * the warrior's shield
     * @return value of the shield
     */
    public int getShield() {
        return this.shield;
    }

    // redefine the hurt method of the class character, in this class

    /**
     * the real value of the damage that the warrior suffered
     * @param hurt the damage I suffered from the opponent
     * @return the true damage that the warrior has suffered
     */
    public int hurtCharacter(int hurt) {
      int trueDamage = hurt - this.shield;
      return super.hurtCharacter(trueDamage);
    }
    /**
     * The class overrides the toString method used in Java to display character information
     */
    public String toString(){
        return super.toString() + ", shield= " + this.shield;
    }
}
