package com.bridgelabz.employeewageproblem;

import java.util.*;

class EmployeeTotalWage {

    public static void computeEmpWage(int company) {

        switch (company) {
            case 1:
                //For TCS rate_per_hour=30,max_hours=200,max_days=30;
                computeCompanyWage("TCS",20, 100, 30);
                break;
            case 2:
                //For Infosys rate_per_hour=40,max_hours=50,max_days=10;
                computeCompanyWage("Infosys",40, 150, 25);
                break;
            case 3:
                //For Wipro rate_per_hour=50,max_hours=100,max_days=40;
                computeCompanyWage("Wipro",55, 200, 10);
                break;
            case 4:
                //For Deloitte rate_per_hour=60,max_hours=150,max_days=20;
                computeCompanyWage("Deloitte",40, 50, 15);
                break;
        }
    }

    public static void computeCompanyWage(String company,int RATE_PER_HOUR,int MAX_HOURS,int MAX_DAYS){
        int  totalDays=0;
        int totalHours=0;

        while (totalHours < MAX_HOURS && totalDays < MAX_DAYS) {

            totalDays++;

            int empCheck = (int) (Math.random() * 3);

            int empHours = 0;

            switch (empCheck) {
                case 1:
                    empHours = 8;
                    break;

                case 2:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            totalHours += empHours;
        }

        int empWage = totalHours * RATE_PER_HOUR;
        System.out.println("Company  : " + company);
        System.out.println("Total Days  : " + totalDays);
        System.out.println("Total Hours : " + totalHours);
        System.out.println("Employee Wage : " + empWage);
    }
}

public class UC8_EmployeeWage {

    public static void main(String[] args) {
        int ch;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\n===== Select Your Campany =====");
            System.out.println("1. TCS");
            System.out.println("2. Infosys");
            System.out.println("3. Wipro");
            System.out.println("4. Deloitte");
            System.out.println("5. Exit");

            System.out.println("Enter your choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                case 2:
                case 3:
                case 4:
                    EmployeeTotalWage.computeEmpWage(ch);
                    break;
                case 5:
                    System.out.println("Thank you. Have a nice day");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (ch!=5);

    }
}
