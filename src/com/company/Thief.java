package com.company;

public class Thief extends Character{

    /**
     * floating value for the dodge probability between 0.0 and 1.0
     */
    private float dodge;
    private int criticalDamage;


    /**
     *
     * @param n
     * @param d
     * @param hp
     * @param init
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

    public int hurtCharacter(int hurt) {
        // lance un dé : regarde si le lancer est plus grand/petit ue la proba d'(esquive du voleur
        if (Math.random() >=  dodge){
            hurt = 0;
        }
        return hurt;
    }


    /**
     * Un voleur possède une probabilité d'appliquer des dégâts critiques. Dans ce cas, il double les dégâts. Les dégâts critiques ne peuvent pas être appliqués sur 2 attaques consécutives
     * @return
     */
    public int getDamage(){
        if (Math.random()*100 >= super.getDamage()) {
            criticalDamage = super.getDamage() * 2;
        }
        else {
            criticalDamage = super.getDamage();:
        }
        return criticalDamage;
    }


    public float getDodge(){
        return this.dodge;
    }
    public int getCriticalDamage(){
        return this.criticalDamage;
    }

    public String toString(){
        return super.toString() + ", dodge: " + this.dodge;
    }
}
