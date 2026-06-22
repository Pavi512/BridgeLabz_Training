package com.bridgelabz.linecomparisonproblem;

public class UC2_LineComparison {

    public static void main(String[] args) {

        int x1 = 2, y1 = 3;
        int x2 = 6, y2 = 7;

        int a1 = 1, b1 = 2;
        int a2 = 5, b2 = 6;

        Double line1 = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        Double line2 = Math.sqrt(
                Math.pow(a2 - a1, 2) +
                        Math.pow(b2 - b1, 2)
        );

        if (line1.equals(line2))
            System.out.println("Both Lines are Equal");
        else
            System.out.println("Both Lines are Not Equal");
    }
}
