package com.bridgelabz.gambling;

import java.util.Random;

public class UC6GamblingSimulator {

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

        int luckiestDay = 1;
        int unluckiestDay = 1;

        int maxWin = Integer.MIN_VALUE;
        int maxLoss = Integer.MAX_VALUE;

        for (int day = 1; day <= 20; day++) {

            int result = playDay();

            if (result > maxWin) {
                maxWin = result;
                luckiestDay = day;
            }

            if (result < maxLoss) {
                maxLoss = result;
                unluckiestDay = day;
            }
        }

        System.out.println("Luckiest Day: " + luckiestDay);
        System.out.println("Unluckiest Day: " + unluckiestDay);
    }
}
