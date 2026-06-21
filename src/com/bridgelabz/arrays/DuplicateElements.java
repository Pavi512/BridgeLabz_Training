package com.bridgelabz.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {

            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate Elements:");

        for (int num : duplicates) {
            System.out.println(num);
        }
    }
}
