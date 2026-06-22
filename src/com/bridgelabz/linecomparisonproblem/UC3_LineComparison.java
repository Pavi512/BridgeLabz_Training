package com.bridgelabz.linecomparisonproblem;

public class UC3_LineComparison {

    public static void main(String[] args) {

        int x1 = 2, y1 = 3;
        int x2 = 6, y2 = 7;

        int a1 = 1, b1 = 2;
        int a2 = 8, b2 = 9;

        Double line1 = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        Double line2 = Math.sqrt(
                Math.pow(a2 - a1, 2) +
                        Math.pow(b2 - b1, 2)
        );

        int result = line1.compareTo(line2);

        if (result == 0)
            System.out.println("Both Lines are Equal");
        else if (result > 0)
            System.out.println("Line1 is Greater than Line2");
        else
            System.out.println("Line1 is Less than Line2");
    }
}
