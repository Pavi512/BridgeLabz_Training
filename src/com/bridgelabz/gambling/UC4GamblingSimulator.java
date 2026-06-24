package com.bridgelabz.gambling;

import java.util.Random;

public class UC4GamblingSimulator {

    static final int STAKE = 100;
    static final int BET = 1;
    static final int WIN_LIMIT = 150;
    static final int LOSS_LIMIT = 50;

    public static int playDay() {

        int cash = STAKE;
        Random random = new Random();

        while (cash > LOSS_LIMIT && cash < WIN_LIMIT) {

            if (random.nextBoolean()) {
                cash += BET;
            } else {
                cash -= BET;
            }
        }

        return cash - STAKE;
    }

    public static void main(String[] args) {

        int totalAmount = 0;

        for (int day = 1; day <= 20; day++) {
            totalAmount += playDay();
        }

        System.out.println("Total Amount got in 20 days: $" + totalAmount);
    }
}
