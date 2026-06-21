package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        reverse(n);
    }

    public static void reverse(int n) {
        int rev = 0;
        while(n>0) {
            rev = rev*10 + (n%10);
            n = n/10;
        }
        System.out.println(rev);;
    }
}
