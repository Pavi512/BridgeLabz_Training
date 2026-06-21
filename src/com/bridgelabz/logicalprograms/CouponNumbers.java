package com.bridgelabz.logicalprograms;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    public static int getRandomCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }

    public static int collectCoupons(int n) {

        HashSet<Integer> coupons = new HashSet<>();

        int totalRandomNumbers = 0;

        while (coupons.size() < n) {

            int coupon = getRandomCoupon(n);

            coupons.add(coupon);

            totalRandomNumbers++;
        }

        System.out.println("Distinct Coupons: " + coupons);

        return totalRandomNumbers;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        int count = collectCoupons(n);

        System.out.println("Total random numbers generated = " + count);

    }
}
