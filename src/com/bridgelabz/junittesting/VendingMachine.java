package com.bridgelabz.junittesting;

import java.util.Scanner;

public class VendingMachine {

    static int count = 0;
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

    public static void calculateNotes(int amount, int index) {

        if (amount == 0 || index == notes.length) {
            return;
        }

        int num = amount / notes[index];

        if (num > 0) {
            System.out.println(notes[index] + " x " + num);
            count += num;
        }

        calculateNotes(amount % notes[index], index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        calculateNotes(amount, 0);

        System.out.println("Minimum Notes = " + count);
    }
}
