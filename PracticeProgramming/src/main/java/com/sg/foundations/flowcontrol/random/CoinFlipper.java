package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        Random coinFlip = new Random();
        int flip = coinFlip.nextInt(2);
        if(flip == 1){
            System.out.println("heads");

        } else if(flip == 0){
            System.out.println("taisl");
        }

    }
}
