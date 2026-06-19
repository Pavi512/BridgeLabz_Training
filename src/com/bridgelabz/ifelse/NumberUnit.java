package com.bridgelabz.ifelse;

import java.util.Scanner;

public class NumberUnit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1, 10, 100, 1000): ");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("Unit");
        } else if (number == 10) {
            System.out.println("Ten");
        } else if (number == 100) {
            System.out.println("Hundred");
        } else if (number == 1000) {
            System.out.println("Thousand");
        } else {
            System.out.println("Invalid Input");
        }

    }
}
