package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Invalid integer. Enter a number greater than 0");
            return;
        }

        double res = 0.0;
        for(int i=1; i<=n; i++){
            res = res + 1.0 /i;
        }

        System.out.println( n + "th Harmonic number is : " + res);
    }
}
