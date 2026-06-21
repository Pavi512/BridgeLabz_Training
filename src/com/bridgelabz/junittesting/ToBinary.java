package com.bridgelabz.junittesting;

import java.util.Scanner;

public class ToBinary {

    public static String toBinary(int number) {

        String res = "";

        while(number>0){
            res = (number%2) + res;
            number = number/2;
        }

        while (res.length() < 32){
            res = "0" + res;
        }

        return  res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        String binary = toBinary(number);

        System.out.println("Binary Representation:");
        System.out.println(binary);

    }
}
