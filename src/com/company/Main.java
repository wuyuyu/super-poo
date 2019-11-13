package com.company;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started");

        CreateDisplayCharacters voleur1 = new CreateDisplayCharacters();

        Character charac1 = new Character("antoine",10,100,0);
        //System.out.println(charac1.toString());
        Character charac2 = new Character("boris",10,100,1);
        Character charac3 = new Character("yuyuan",10,100,1);


        List<Character> listCharacter;
        listCharacter = new ArrayList<>();


        listCharacter.add(charac1);
        listCharacter.add(charac2);
        listCharacter.add(charac3);

        int i;
        for (i = 0; i < listCharacter.size() ; i++) {
            System.out.println("Index of the character : " + i);
            System.out.println(listCharacter.get(i));
        }

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
            System.out.println(ch);
            // if command is valid, process it
            if( ch != -1 ){
                Order.processCmd( ch );
            }
        }
        while (ch != 2);

    }


}
