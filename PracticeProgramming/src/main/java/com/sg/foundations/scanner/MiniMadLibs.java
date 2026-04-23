package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {

    Scanner inputReader = new Scanner(System.in);

    String noun1;
    String noun2;

    System.out.println("Whats ur name");
    noun1 = inputReader.nextLine();

    System.out.println("Whats ur bros name");
    noun2 = inputReader.nextLine();

        System.out.println("you are " + noun1 + " and ur bro is " + noun2);

    }


}
