package com.bridgelabz.operators;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = c + a / b;
        int result3 = a % b + c;
        int result4 = a * b + c;

        System.out.println("a + b * c = " + result1);
        System.out.println("c + a / b = " + result2);
        System.out.println("a % b + c = " + result3);
        System.out.println("a * b + c = " + result4);

        int max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
        int min = Math.min(Math.min(result1, result2), Math.min(result3, result4));

        System.out.println("Maximum Value = " + max);
        System.out.println("Minimum Value = " + min);

    }
}
