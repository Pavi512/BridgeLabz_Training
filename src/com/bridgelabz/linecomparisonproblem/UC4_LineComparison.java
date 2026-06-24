package com.bridgelabz.corejava.linecomparisonproblem;

import java.util.Scanner;

class Point {

    // Instance variables
    int x;
    int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {

    // Two end points of line
    Point p1;
    Point p2;

    // Constructor
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Method to calculate line length
    public Double calculateLength() {

        return Math.sqrt(
                Math.pow(p2.x - p1.x, 2)
                        + Math.pow(p2.y - p1.y, 2));
    }
}

public class UC4_LineComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Line 1
        System.out.println("Enter Line 1 Coordinates:");

        System.out.print("x1: ");
        int x1 = sc.nextInt();

        System.out.print("y1: ");
        int y1 = sc.nextInt();

        System.out.print("x2: ");
        int x2 = sc.nextInt();

        System.out.print("y2: ");
        int y2 = sc.nextInt();

        // Input Line 2
        System.out.println("\nEnter Line 2 Coordinates:");

        System.out.print("x3: ");
        int x3 = sc.nextInt();

        System.out.print("y3: ");
        int y3 = sc.nextInt();

        System.out.print("x4: ");
        int x4 = sc.nextInt();

        System.out.print("y4: ");
        int y4 = sc.nextInt();

        // Create Point objects
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        Point point3 = new Point(x3, y3);
        Point point4 = new Point(x4, y4);

        // Create Line objects
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        // Calculate lengths
        Double length1 = line1.calculateLength();
        Double length2 = line2.calculateLength();

        // Display lengths
        System.out.println("\nLine 1 Length = " + length1);
        System.out.println("Line 2 Length = " + length2);

        // Check equality
        if (length1.equals(length2)) {
            System.out.println("Both lines are equal.");
        }
        else {
            System.out.println("Both lines are not equal.");
        }

        // Compare lines
        int result = length1.compareTo(length2);

        if (result > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        }
        else if (result < 0) {
            System.out.println("Line 1 is less than Line 2.");
        }
        else {
            System.out.println("Both lines are equal.");
        }

    }
}
