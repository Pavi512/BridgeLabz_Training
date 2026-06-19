package com.bridgelabz.whileloop;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        while(n>0){
            sum = sum + n;
            n--;
        }

        System.out.println("Sum = " + sum);

    }
}
