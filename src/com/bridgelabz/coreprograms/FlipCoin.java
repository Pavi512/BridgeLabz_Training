package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int n = sc.nextInt();

        int headCount = 0;
        int tailCount = 0;

        if(n<0) {
            System.out.println("Invalid");
            return;
        }

        for(int i=0; i<n; i++){
            double res = Math.random();

            if(res<0.5){
                tailCount++;
            }
            else{
                headCount++;
            }
        }

        double headPercentage = (headCount*100.0)/n;
        double tailPercentage = (tailCount*100.0)/n;

        System.out.println("Heads Count = " + headCount);
        System.out.println("Tails Count = " + tailCount);
        System.out.println("Heads Percentage = " + headPercentage + "%");
        System.out.println("Tails Percentage = " + tailPercentage + "%");
    }
}
