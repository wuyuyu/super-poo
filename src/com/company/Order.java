package com.company;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {




/**
    Creating a class with static methods for order management
    Add a help command (which displays the possible commands)
    Adding a command to exit the application
    Display the list of commands if the typed command is invalid
    All code elements and comments are in English Project documentation in code (JavaDoc)
    Realization of a class diagram of the application
    Archiving under Git of the deliverable of the story (code + class diagram)
 */

    // this method is to list the menu:

    /**
     * The command list that the user will be able to type in the command prompt
     */
    public static void help() {
        System.out.println("MENU : ");
        System.out.println("Step 1 to create a default character."); // create and display a character
        System.out.println("Step 2 to display characters.");
        System.out.println("Step 3 to choice a character for list his details. ");
        System.out.println("Step 4 to start fight between 2 characters");
        System.out.println("step 5 to remove a character.");
        System.out.println("step 6 to create a Warrior.");
        System.out.println("step 7 to create a Wizard.");
        System.out.println("step 8 to create a Thief.");
        System.out.println("Step 9 to exit the game. ");
        System.out.println("Step 0 for help ....");

    }

    /**
     *
     * @return the command that the user typed
     */
    public static int getUserChoice(){

        // affichez un message
        // instancier le scanner
        // lire la ligne de l'user

        // test the value entered by the user
        // if it is correct we return the value (int)
        // if it is incorrect we return -1
        System.out.println("Entrez une commande : ");
        Scanner sc = new Scanner(System.in);

        int choice;

        try {
            choice = sc.nextInt();
        }
        catch(Exception ex){
            choice = -1;
        }

        if (choice < 0){
            choice = -1;
        }
        return choice;
    }


    // create a method to create a character with the default characteristics

    /**
     * For create a default character with all the statistic
     * @return the default character
     */
    public static Character createCharacter () {

        System.out.println("Enter the name of your character : ");
        Scanner sc = new Scanner(System.in);
        String nameCharacter = sc.next();

        System.out.println("Enter the healpoint of your character : ");
        Scanner scan = new Scanner(System.in);
        String healPointCharacter = scan.next();
        int hpCharacter = Integer.parseInt(healPointCharacter);

        System.out.println("Enter the power of your character : ");
        Scanner sca = new Scanner(System.in);
        String powerCharacter = sca.next();
        int pcCharacter = Integer.parseInt(powerCharacter);

        System.out.println("Enter the initiative of your character : ");
        Scanner scann = new Scanner(System.in);
        String initiativeCharacter = scann.next();
        int iniCharacter = Integer.parseInt(initiativeCharacter);

        Character characterPlayer = new Character(nameCharacter, pcCharacter, hpCharacter, iniCharacter);
        System.out.println("Your character has been created with success!");
        System.out.println(characterPlayer);

        return characterPlayer;
    }

    /**
     * For display all the character who has been created
     * @param listCP the list where we stocked all the created character
     */
    public static void displayAllCharacters (List<Character> listCP){

        int i;
        for (i = 0; i < listCP.size() ; i++) {
            System.out.println("Index of the character : " + i);
            System.out.println(listCP.get(i));
        }

    }

    /**
     * For display one character who has been created with indicating his index
     * @param listCP the list where we stocked all the created character
     */
    public static void displayOneCharacter (List<Character> listCP){
        System.out.println("enter the index of your character : ");
        int ch = getUserChoice();
        System.out.println(listCP.get(ch));
    }

    /**
     * For delete a character from the list
     * @param listCP the list where we stocked all the created character
     */
    public static void removeOneCharacter (List<Character> listCP){
        System.out.println("enter the index of your character : ");
        int ch = getUserChoice();
        System.out.println("Are you sure that you wants to delete this character? Step 1 to confirm. ");
        int yn = getUserChoice();
        if (yn == 1) {
            // remove object Character at index ch and retrieve this object from method return
            Character removedCharacter = listCP.remove(ch);
            System.out.println( "The character named " + removedCharacter.getName() + " from class " + removedCharacter.getClass().getSimpleName() + " has been removed ^^" );
        }
    }

    /**
     * For create a Warrior character with all the default statistic and the warrior stat
     * @return return the warrior character
     */
    static public Warrior createWarrior (){
        System.out.println("Enter the name of your warrior : ");
        Scanner sc = new Scanner(System.in);
        String nameCharacter = sc.next();

        // enter and get the HP value of the character
        System.out.println("Enter the healpoint of your warrior : ");
        Scanner scan = new Scanner(System.in);
        String healPointCharacter = scan.next();
        int hpCharacter = Integer.parseInt(healPointCharacter);

        // get the power value
        System.out.println("Enter the power of your warrior : ");
        Scanner sca = new Scanner(System.in);
        String powerCharacter = sca.next();
        int pcCharacter = Integer.parseInt(powerCharacter);


        // get the initiative (turn order)
        System.out.println("Enter the initiative of your warrior : ");
        Scanner scann = new Scanner(System.in);
        String initiativeCharacter = scann.next();
        int iniCharacter = Integer.parseInt(initiativeCharacter);

        System.out.println("Enter the shield value of your warrior : ");
        Scanner scanS = new Scanner(System.in);
        String shieldCharacter = scann.next();
        int shieldWarrior = Integer.parseInt(shieldCharacter);

        Warrior createWarrior = new Warrior(nameCharacter, pcCharacter, hpCharacter, iniCharacter, shieldWarrior);
        System.out.println("Your warrior has been created with success!");

        return createWarrior;
    }

    /**
     * For create a wizard character with all the default character statistics and the wizard stat
     * @return rhe wizard character
     */
    static public Wizard createWizard (){
        System.out.println("Enter the name of your wizard : ");
        Scanner sc = new Scanner(System.in);
        String nameCharacter = sc.next();

        // enter and get the HP value of the character
        System.out.println("Enter the healpoint of your wizard : ");
        Scanner scan = new Scanner(System.in);
        String healPointCharacter = scan.next();
        int hpCharacter = Integer.parseInt(healPointCharacter);

        // get the power value
        System.out.println("Enter the power of your wizard : ");
        Scanner sca = new Scanner(System.in);
        String powerCharacter = sca.next();
        int pcCharacter = Integer.parseInt(powerCharacter);


        // get the initiative (turn order)
        System.out.println("Enter the initiative of your wizard : ");
        Scanner scann = new Scanner(System.in);
        String initiativeCharacter = scann.next();
        int iniCharacter = Integer.parseInt(initiativeCharacter);

        System.out.println("Enter the wizard damage value of your wizard : ");
        Scanner scanS = new Scanner(System.in);
        String wizardDamage = scann.next();
        int wiz = Integer.parseInt(wizardDamage);

        Wizard createWizard = new Wizard(nameCharacter, pcCharacter, hpCharacter, iniCharacter, wiz);
        System.out.println("Your wizard has been created with success!");

        return createWizard;
    }

    /**
     * For create a thief character with all the statistic
     * @return the thief character
     */
    static public Thief createThief () {
           System.out.println("Enter the name of your thief : ");
           Scanner sc = new Scanner(System.in);
           String nameCharacter = sc.next();

           // enter and get the HP value of the character
           System.out.println("Enter the healpoint of your thief : ");
           Scanner scan = new Scanner(System.in);
           String healPointCharacter = scan.next();
           int hpCharacter = Integer.parseInt(healPointCharacter);

           // get the power value
           System.out.println("Enter the power of your thief : ");
           Scanner sca = new Scanner(System.in);
           String powerCharacter = sca.next();
           int pcCharacter = Integer.parseInt(powerCharacter);


           // get the initiative (turn order)
           System.out.println("Enter the initiative of your thief : ");
           Scanner scann = new Scanner(System.in);
           String initiativeCharacter = scann.next();
           int iniCharacter = Integer.parseInt(initiativeCharacter);

           System.out.println("Enter the critical hit probability of your thief : ");
           Scanner scanS = new Scanner(System.in);
           String criticalDamage = scann.next();
           int ccDmg = Integer.parseInt(criticalDamage);

           Thief createThief = new Thief(nameCharacter, pcCharacter, hpCharacter, iniCharacter, ccDmg);
           System.out.println("Your thief has been created with success!");

           return createThief;

       }


    // regarder qui a la plus grande initiative =>
    // c'est lui qui commence a taper : getDamage de celui qui tape et tu appliques cette valeur dans le hurt de l'autre
    // ensuite on verifie que personne est mort sinon afficher un message
    // on change l'attaquant et le defenseur
    // et on recommence
    //chaque attack on affiche les détails de combat

    public static void fight (List<Character> listCP) {

        System.out.println("Player 1: please enter the index of your first fighter: ");
        Scanner sc = new Scanner((System.in));
        int fi1 = sc.nextInt();

        System.out.println("Player 2: please enter the index of your first fighter: ");
        int fi2 = sc.nextInt();

        Character player1 = listCP.get(fi1);
        Character player2 = listCP.get(fi2);

        int player1RealHP = player1.getHealPoint();
        int player2RealHP = player2.getHealPoint();

        do{


            if (player1.getInitiative() > player2.getInitiative()) {


                player2.hurtCharacter( player1.getDamage() );

                if (player2.getHealPoint() > 0) {
                    player1.hurtCharacter( player2.getDamage() );
                } else {
                    System.out.println(player1.getName() + " win!!");
                    System.out.println(player2.getName() + "lose!!");
                }

            }


            else {
                player1.hurtCharacter( player2.getDamage() );

                if (player1.getHealPoint()>0) {

                    player2.hurtCharacter( player1.getDamage() );

                }

                else {
                    System.out.println(player2.getName() + " win!!");
                    System.out.println(player1.getName() + "lose!!");
                }

            }


        } while ( player2.getIsAlive() && player1.getIsAlive() );




    }




    /**
     * orders made according to the user's request
     * @param cmdNumber the index of the command list
     * @param listCP the list where we stocked all the created character
     */
    public static void processCmd(int cmdNumber, List<Character> listCP){

        if(cmdNumber == 0){
            Order.help();
        }
        if(cmdNumber == 1){
            listCP.add(Order.createCharacter());
        }
        if(cmdNumber == 2){
            Order.displayAllCharacters (listCP);
        }
        if (cmdNumber ==3){
            Order.displayOneCharacter(listCP);
        }
        if (cmdNumber ==4){
            Order.fight(listCP);
        }
        if (cmdNumber == 5){
           Order.removeOneCharacter(listCP);
        }
        if (cmdNumber == 6){
            listCP.add( Order.createWarrior() );
        }
        if (cmdNumber == 7){
            listCP.add(Order.createWizard());
        }
        if (cmdNumber == 8){
            listCP.add(Order.createThief());
        }
    }
}
