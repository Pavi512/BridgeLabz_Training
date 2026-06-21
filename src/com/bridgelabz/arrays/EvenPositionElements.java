package com.bridgelabz.arrays;

import java.util.Scanner;

public class EvenPositionElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] ar = new int[size];
        for(int i=0; i<ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        for(int i=0; i<ar.length; i++){
            if(i%2==0){
                System.out.println(ar[i]);
            }
        }

    }
}
