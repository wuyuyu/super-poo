package com.company;

public class Wizard extends Character {
    /**
     *Les dégâts magiques sont rajoutés aux dégâts de base, mais
     *
     *
     * ces dégâts magiques sont réduits de moitié après chaque attaque.
     * Les dégâts magiques sont réinitialisés à leur valeur d'origine au début de chaque combat
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
        int wD;
        wD = getWizardDamage();
        int trueDamage = super.getDamage() + wD;
        return trueDamage;

        /*
        boolean gameOn = true;

        int wD;
        wD = this.wizardDamage;
        int trueDamage = super.getDamage() + wD;
        while (gameOn = true){
            wD = Math.round(wD / 2);
        }
        if (Character.getIsAlive() == false){
            gameOn = false;
        }
            return trueDamage;

         */
    }


    public String toString (){
        return super.toString() + ", wizard damage: " + this.wizardDamage;
    }

}
