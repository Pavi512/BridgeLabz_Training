package com.bridgelabz.logicalprograms;

import java.util.Scanner;


public class Stopwatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Press Enter to Start the Stopwatch");
        sc.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Press Enter to Stop the Stopwatch");
        sc.nextLine();

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time = " + elapsedTime + " milliseconds");

        sc.close();
    }
}
