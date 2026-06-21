package com.bridgelabz.logicalprograms;

import java.util.Scanner;

//A Perfect Number is a number that is equal to the sum of all its positive factors (divisors), excluding the number itself.
//
//In simple words:
//
//Find all the factors of the number except the number itself.
//Add those factors.
//If the sum equals the original number, then it is a Perfect Number.

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        isPerfect(n);
    }

    public static void isPerfect(int n) {
        int sum = 0;
        for(int i=1; i<n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) {
            System.out.println("Perfect");
        }
        else {
            System.out.println("Not Perfect");
        }
    }
}