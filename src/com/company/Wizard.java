package com.company;

public class Wizard extends Character {

    private int wizardDamage;
    // manque de propriéte

    public Wizard(String n, int d, int hp, int init, int wd) {
        super(n, d, hp, init);
        this.wizardDamage = wd;
    }

    public int getWizardDamage(){
        return this.wizardDamage;
    }


    public int getDamage(){
        int trueDamage = super.getDamage() + this.wizardDamage;
        return trueDamage;
    }


    public String toString (){
        return super.toString() + ", wizard damage: " + this.wizardDamage;
    }

}
