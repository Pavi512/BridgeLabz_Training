package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class DistinctTriplets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("Triplets whose sum is zero:");

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {

                        System.out.println(
                                arr[i] + " "
                                        + arr[j] + " "
                                        + arr[k]);

                        count++;
                    }
                }
            }
        }
        System.out.println("Number of Triplets = " + count);
    }

}
