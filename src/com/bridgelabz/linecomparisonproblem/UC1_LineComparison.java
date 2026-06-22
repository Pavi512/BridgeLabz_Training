package com.bridgelabz.linecomparisonproblem;

public class UC1_LineComparison {

    public static void main(String[] args) {

        int x1 = 2, y1 = 3;
        int x2 = 6, y2 = 7;

        double length = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        System.out.println("Length of Line = " + length);
    }
}
