package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Prime Factors: ");

        for (int i = 2; i * i <= n; i++) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if (n > 1) {
            System.out.print(n);
        }

    }
}
