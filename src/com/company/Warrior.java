package com.company;

import java.util.Scanner;

public class Warrior extends Character {

    private int shield;

    public Warrior(String n, int d, int hp, int init, int sh) {
        super(n, d, hp, init);
        this.shield = sh;
    }

    public int getShield() {
        return this.shield;
    }

    // redefine the hurt method of the class character, in this class
    public int hurtCharacter(int hurt) {
      int trueDamage = hurt - this.shield;
      return super.hurtCharacter(trueDamage);
    }

    public String toString(){
        return super.toString() + ", shield= " + this.shield;
    }
}
