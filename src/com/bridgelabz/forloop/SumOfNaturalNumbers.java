package com.bridgelabz.forloop;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = n; i > 0; i--) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

    }
}
