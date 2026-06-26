package com.bridgelabz.employeewageproblem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UC9_EmployeeWage {

    // Constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;

    // Company details
    private String company;
    private int empRatePerHour;
    private int maxWorkDays;
    private int maxWorkHours;
    private int totalWage;

    // Constructor
    public UC9_EmployeeWage(String company,
                            int empRatePerHour,
                            int maxWorkingDays,
                            int maxWorkingHours) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.maxWorkDays = maxWorkingDays;
        this.maxWorkHours = maxWorkingHours;
    }

    // Method to compute wage
    public void computeEmployeeWage() {

        int totalHours = 0;
        int totalDays = 0;

        Random random = new Random();

        while (totalHours < maxWorkHours && totalDays < maxWorkDays) {

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

        totalWage = totalHours * empRatePerHour;
    }

    // Display method
    public void displayCompanyWage() {

        System.out.println("Company Name      : " + company);
        System.out.println("Rate Per Hour     : " + empRatePerHour);
        System.out.println("Maximum Days      : " + maxWorkDays);
        System.out.println("Maximum Hours     : " + maxWorkHours);
        System.out.println("Total Wage        : " + totalWage);
        System.out.println();
    }

    public static void main(String[] args) {

        // Object for TCS
        UC9_EmployeeWage tcs = new UC9_EmployeeWage("TCS", 20, 20, 100);

        // Object for Infosys
        UC9_EmployeeWage infosys = new UC9_EmployeeWage("Infosys", 25, 22, 120);

        // Object for wipro
        UC9_EmployeeWage wipro = new UC9_EmployeeWage("Wipro",55, 200, 10);

        // Object for deloitte
        UC9_EmployeeWage deloitte = new UC9_EmployeeWage("Deloitte",40, 50, 15);

        // Compute wages
        tcs.computeEmployeeWage();
        infosys.computeEmployeeWage();
        wipro.computeEmployeeWage();
        deloitte.computeEmployeeWage();

        // Display wages
        tcs.displayCompanyWage();
        infosys.displayCompanyWage();
        wipro.displayCompanyWage();
        deloitte.displayCompanyWage();

    }
}