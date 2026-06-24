package com.bridgelabz.gambling;

import java.util.Random;

public class UC5GamblingSimulator {

    static final int STAKE = 100;
    static final int BET = 1;
    static final int WIN_LIMIT = 150;
    static final int LOSS_LIMIT = 50;

    public static int playDay() {

        int cash = STAKE;
        Random random = new Random();

        while (cash > LOSS_LIMIT && cash < WIN_LIMIT) {

            if (random.nextBoolean()) {
                cash++;
            } else {
                cash--;
            }
        }

        return cash - STAKE;
    }

    public static void main(String[] args) {

        for (int day = 1; day <= 20; day++) {

            int result = playDay();

            if (result > 0) {
                System.out.println("Day " + day +
                        " Won $" + result);
            } else {
                System.out.println("Day " + day +
                        " Lost $" + Math.abs(result));
            }
        }
    }
}
