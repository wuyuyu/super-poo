package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started");

        Order.help();

        int ch = Order.getUserChoice();

        System.out.println(ch);


    }
}
