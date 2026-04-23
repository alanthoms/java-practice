package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {

        Random rng = new Random();

        int randomNumber = rng.nextInt(100) + 1;

        Scanner inputReader = new Scanner(System.in);

        boolean figured = false;

        while (!figured){
            System.out.println("Guess number");
            int guess = inputReader.nextInt();
            System.out.println("you guessed :" + guess  );
            if(guess == randomNumber){
                figured = true;
                System.out.println("correct the answer is " + randomNumber);
            } else if (guess > randomNumber) {
                System.out.println("your guess is greater");

            } else {
                System.out.println("your guess is lower");
            }

        }
    }
}
