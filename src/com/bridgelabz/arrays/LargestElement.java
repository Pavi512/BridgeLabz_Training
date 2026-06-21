package com.bridgelabz.arrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] ar = new int[size];
        for(int i=0; i<ar.length; i++){
            ar[i] = scanner.nextInt();
        }
        int max = ar[0];
        for(int i=0; i<ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        System.out.println(max);
    }
}
