package com.bridgelabz.employeewageproblem;

import java.util.Random;

public class UC7_EmployeeWage {

    // Class variables
    static final int EMP_RATE_PER_HOUR = 20;
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;
    static final int MAX_HOURS = 100;
    static final int MAX_DAYS = 20;

    // Class method
    public static int computeEmployeeWage() {

        int totalHours = 0;
        int totalDays = 0;

        Random random = new Random();

        while (totalHours <= MAX_HOURS && totalDays < MAX_DAYS) {

            totalDays++;

            int empCheck = random.nextInt(3);
            int empHours = 0;

            switch (empCheck) {

                case FULL_TIME:
                    empHours = 8;
                    break;

                case PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            totalHours += empHours;
        }

        return totalHours * EMP_RATE_PER_HOUR;
    }

    public static void main(String[] args) {

        int totalWage = computeEmployeeWage();

        System.out.println("Total Employee Wage = " + totalWage);
    }
}