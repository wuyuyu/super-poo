package com.company;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started");
        List<Character> listCharacter;
        listCharacter = new ArrayList<>();

        /* une autre façon de parcourir la liste afin d'afficher tous les éléments de la liste

        for( Character c : listCharacter ){
            System.out.println(c);
        }
        */

        Order.help();
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
