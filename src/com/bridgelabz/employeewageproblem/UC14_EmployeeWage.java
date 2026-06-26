package com.bridgelabz.employeewageproblem;

import java.util.ArrayList;
import java.util.Scanner;

//Interface of employee wage builder
interface EmployeeWagesBuilderInterface {

    void calculateWages();
    void displayWages();
    void getTotalWage(String companyName);
}

//Employee wage builder class for multiple companies that implements interface
class EmployeeWagesBuilder implements EmployeeWagesBuilderInterface{
    //Array list to store multiple companies
    ArrayList<CompanyEmployeeWages> comList = new ArrayList<CompanyEmployeeWages>();

    //Default constructor
    public EmployeeWagesBuilder() {
        comList.add(new CompanyEmployeeWages("TCS",20, 100, 30));
        comList.add(new CompanyEmployeeWages("Infosys",40, 150, 25));
        comList.add(new CompanyEmployeeWages("Wipro",55, 200, 10));
        comList.add(new CompanyEmployeeWages("Deloitte", 40, 50, 15));
    }
    //Overridden method to calculate wages
    @Override
    public void calculateWages(){
        for(CompanyEmployeeWages a : comList){
            a.computeEmpWage();
        }
    }
    //Overridden method to display wages
    @Override
    public void displayWages(){
        for(CompanyEmployeeWages a : comList) {
            a.display();
        }
    }
    //Overridden method to get total wage
    @Override
    public void getTotalWage(String companyName) {
        for (CompanyEmployeeWages company : comList) {
            if (company.getCompany().equalsIgnoreCase(companyName)) {
                System.out.println("Total Wage of " + company.getCompany() + " = " + company.getTotalWage());
                return;
            }
        }
        System.out.println("Company not found.");
    }
}

//Class to calculate company employee wages
class CompanyEmployeeWages {

    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    //Array list to store daily wages
    private ArrayList<Integer> dailyWages = new ArrayList<Integer>();

    //Parameterized constructor
    public CompanyEmployeeWages(String company, int ratePerHour,
                             int maxHours, int maxDays) {

        this.company = company;
        this.ratePerHour = ratePerHour;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
    }

    //Method to compute the employee wage in each company
    public void computeEmpWage() {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxHours && totalDays < maxDays) {

            totalDays++;

            int empCheck = (int)(Math.random() * 3);

            int empHours = 0;

            switch(empCheck) {

                case 1:
                    empHours = 8;
                    break;

                case 2:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            if(totalHours + empHours > maxHours) {
                break;
            }

            totalHours += empHours;

            int dailyWage = empHours * ratePerHour;
            dailyWages.add(dailyWage);
        }

        totalWage = totalHours * ratePerHour;
    }

    //Method to display company and its total wage and its daily wage
    public void display() {
        System.out.println("Company : " + company);

        System.out.println("Daily Wages :");
        for(int i = 0; i < dailyWages.size(); i++) {
            System.out.println("Day " + (i+1) + " Wage : " + dailyWages.get(i));
        }
        System.out.println("Total Wage : " + totalWage);
    }

    //Getter to get company
    public String getCompany() {
        return company;
    }

    //Getter to get total wage
    public int getTotalWage() {
        return totalWage;
    }
}

//Main method
public class UC14_EmployeeWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Object creation to display total wage based on company name entered by user
        EmployeeWagesBuilderInterface ewb = new EmployeeWagesBuilder();
        ewb.calculateWages();
        ewb.displayWages();

        System.out.print("\nEnter Company Name: ");
        String company = sc.nextLine();

        ewb.getTotalWage(company);
    }
}
