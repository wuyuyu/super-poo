package com.company;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        /*code de test de romuald dit "mister freeze"
        Wizard w1 = new Wizard("romu", 10,10,10, 30);

        Character c1 = w1;

        int dmg = c1.getDamage();
        System.out.println(dmg);*/



        System.out.println("Application has started");
        List<Character> listCharacter;
        listCharacter = new ArrayList<>();

        Order.help();

        /*
        try {
            Thread.sleep(3000);
        }
        catch(Exception e){

        }
        */

        int ch;
        do{
            ch = Order.getUserChoice();
            // if command is valid, process it
            if( ch != -1 ){
                Order.processCmd( ch, listCharacter );
            }
        }
        while (ch != 9);
    }
}
