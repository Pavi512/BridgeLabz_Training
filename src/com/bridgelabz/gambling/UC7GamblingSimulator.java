package com.bridgelabz.gambling;

import java.util.Random;

public class UC7GamblingSimulator {

    static final int MONTH_DAYS = 20;
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

        int month = 1;
        int totalAmount = 0;

        while (true) {

            int monthlyResult = 0;

            for (int day = 1; day <= MONTH_DAYS; day++) {
                monthlyResult += playDay();
            }

            totalAmount += monthlyResult;

            System.out.println("Month " + month +
                    " Result = $" + monthlyResult);

            if (monthlyResult <= 0) {
                System.out.println("Stop Gambling");
                break;
            }

            System.out.println("Continue Gambling");

            month++;
        }

        System.out.println("Total Profit/Loss = $" + totalAmount);
    }
}
