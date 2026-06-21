package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibonacciSeries(n);
    }

    public static void fibonacciSeries(int n) {
        int f0 = 0;
        int f1 = 1;
        for (int count = 0; count < n; count++) {
            System.out.print(f0 + " ");
            int temp = f0 + f1;
            f0 = f1;
            f1 = temp;
        }
    }

}

