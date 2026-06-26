package com.bridgelabz.employeewageproblem;

import java.util.ArrayList;

//Interface of employee wage builder
interface EmployeesWageBuilderInterface {

    void calculateWages();
    void displayWages();
}

//Employee wage builder class for multiple companies that implements interface
class EmployeesWageBuilder implements EmployeesWageBuilderInterface{
    //Array list to store multiple companies
    ArrayList<CompanyEmployeesWage> comList = new ArrayList<CompanyEmployeesWage>();

    //Default constructor
    public EmployeesWageBuilder() {
        comList.add(new CompanyEmployeesWage("TCS",20, 100, 30));
        comList.add(new CompanyEmployeesWage("Infosys",40, 150, 25));
        comList.add(new CompanyEmployeesWage("Wipro",55, 200, 10));
        comList.add(new CompanyEmployeesWage("Deloitte", 40, 50, 15));
    }

    //Overridden method to calculate wages
    @Override
    public void calculateWages(){
        for(CompanyEmployeesWage a : comList){
            a.computeEmpWage();
        }
    }
    //Overridden method to display wages
    @Override
    public void displayWages(){
        for(CompanyEmployeesWage a : comList) {
            a.display();
        }
    }
}

//Class to calculate company employee wages
class CompanyEmployeesWage {

    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    //Array list to store daily wages
    private ArrayList<Integer> dailyWages = new ArrayList<Integer>();

    //Parameterized constructor
    public CompanyEmployeesWage(String company, int ratePerHour,
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
}

//Main method
public class UC13_EmployeeWage {
    public static void main(String[] args){
        EmployeesWageBuilderInterface ewb = new EmployeesWageBuilder();
        ewb.calculateWages();
        ewb.displayWages();
    }
}
