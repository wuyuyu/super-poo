package com.company;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started");








        //CreateDisplayCharacters voleur1 = new CreateDisplayCharacters();



        List<Character> listCharacter;
        listCharacter = new ArrayList<>();






        /*
        for( Character c : listCharacter ){
            System.out.println(c);
        }
        //*/




                //System.out.println(listCharacter + Index_0);



        Order.help();
        int ch;
        do{
            ch = Order.getUserChoice();
            // if command is valid, process it
            if( ch != -1 ){
                Order.processCmd( ch, listCharacter );
                Order.ListCharacterPlayer(Order.createCharacter());
            }
        }
        while (ch != 2);

    }


}
