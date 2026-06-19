package com.bridgelabz.forloop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reverse = 0;

        for(int i=n; i>0; i = i/10){
            reverse = reverse * 10 + (i % 10);
        }

        System.out.println("Reversed Number = " + reverse);

    }
}
