package com.company;

public class Wizard extends Character {
    /**
     *
     */
    private int wizardDamage;
    // manque de propriéte

    /**
     * Create a character wizard who inherits the class Character
     * @param n wizard's name
     * @param d the wizard's damage
     * @param hp the wizard's heal points
     * @param init the wizard's initiative
     * @param wd the magic damage of the wizard
     */
    public Wizard(String n, int d, int hp, int init, int wd) {
        super(n, d, hp, init);
        this.wizardDamage = wd;
    }

    /**
     * For getting the wizard damage
     * @return the wizard damage
     */
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
