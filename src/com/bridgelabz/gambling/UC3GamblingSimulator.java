package com.bridgelabz.gambling;


import java.util.Random;

public class UC3GamblingSimulator {

    static final int STAKE = 100;
    static final int BET = 1;
    static final int WIN_LIMIT = 150;
    static final int LOSS_LIMIT = 50;

    public static void main(String[] args) {

        int cash = STAKE;
        int bets = 0;

        Random random = new Random();

        while (cash > LOSS_LIMIT && cash < WIN_LIMIT) {

            bets++;

            if (random.nextBoolean()) {
                cash += BET;
            } else {
                cash -= BET;
            }
        }

        System.out.println("Final Cash: $" + cash);
        System.out.println("Number of Bets: " + bets);
    }
}
