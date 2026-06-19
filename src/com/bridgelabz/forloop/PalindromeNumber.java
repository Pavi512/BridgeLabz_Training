package com.bridgelabz.forloop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int reverse = 0;

        for(int i=number; i>0; i = i/10){
            reverse = reverse * 10 + (i % 10);
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a Palindrome Number");
        } else {
            System.out.println(originalNumber + " is not a Palindrome Number");
        }

    }
}
