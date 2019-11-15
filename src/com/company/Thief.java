package com.company;

public class Thief extends Character{

    private float dodge;
    private float criticalDamage;

    public Thief(String n, int d, int hp, int init, float dod) {
        super(n, d, hp, init);
        this.dodge = dod;
    }

// ajoute propriété privée pour le sdéghats critiques (e t la mathode publique pour la recuperer).
// créer une probabilité d'appliquer des degats des dégats critiqueS. Dans ce cas, il double els dégats.
//le sdegats critiques ne peuvent pas être appliqués sur deux attaques conséctuives.
    // créer une probab pour esquyiver totalement une attaque.
    // getEnnemyDamage pour passer en paramettre

    private int proba_dodge_zero (int hurt) {
        hurt = getEnemyDamage;
        double proba = Math.random() * 100;
        if (proba < 50) {
            hurt = 0;
        }
        return hurt;
    }
    private void probaCcDmg (){
        double prob = Math.random()*100);
        if (prob < 50) {
             criticalDamage = super.getDamage()*2;
        }
    }

    public float getDodge(){
        return this.dodge;
    }
    public float getCriticalDamage(){
        return this.criticalDamage;
    }


    public int hurtCharacter(int hurt) {
        return super.hurtCharacter(hurt);
    }

    public String toString(){
        return super.toString() + ", dodge: " + this.dodge;
    }
}
