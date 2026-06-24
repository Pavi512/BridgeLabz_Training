package com.bridgelabz.gambling;

import java.util.Random;

public class UC2GamblingSimulator {

    static final int STAKE = 100;
    static final int BET = 1;

    public static void main(String[] args) {

        int cash = STAKE;

        Random random = new Random();

        if (random.nextBoolean()) {
            cash += BET;
            System.out.println("Won $1");
        } else {
            cash -= BET;
            System.out.println("Lost $1");
        }

        System.out.println("Current Cash: $" + cash);
    }
}
