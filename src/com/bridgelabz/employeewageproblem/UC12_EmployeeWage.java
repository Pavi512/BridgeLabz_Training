package com.bridgelabz.employeewageproblem;

import java.util.ArrayList;

//Interface of employee wage builder
interface EmployWageBuilderInterface {

    void calculateWages();
    void displayWages();
}

//Employee wage builder class for multiple companies that implements interface
class EmployWageBuilder implements EmployWageBuilderInterface{
    //Array list to store multiple companies
    ArrayList<CompanyEmployWage> comList = new ArrayList<>();

    //Default constructor
    public EmployWageBuilder() {
        comList.add(new CompanyEmployWage("TCS",20, 100, 30));
        comList.add(new CompanyEmployWage("Infosys",40, 150, 25));
        comList.add(new CompanyEmployWage("Wipro",55, 200, 10));
        comList.add(new CompanyEmployWage("Deloitte", 40, 50, 15));
    }

    //Overridden method to calculate wages
    @Override
    public void calculateWages(){
        for(CompanyEmployWage a : comList){
            a.computeEmpWage();
        }
    }
    //Overridden method to display wages
    @Override
    public void displayWages(){
        for(CompanyEmployWage a : comList) {
            a.display();
        }
    }
}

//Class to calculate company employee wages
class CompanyEmployWage {

    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    //Parameterized constructor
    public CompanyEmployWage(String company, int ratePerHour,
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

            totalHours += empHours;
        }

        totalWage = totalHours * ratePerHour;
    }

    //Method to display company and its total wage
    public void display() {
        System.out.println("Company : " + company);
        System.out.println("Total Wage : " + totalWage);
    }
}

//Main method
public class UC12_EmployeeWage {
    public static void main(String[] args){
        EmployWageBuilderInterface ewb = new EmployWageBuilder();
        ewb.calculateWages();
        ewb.displayWages();
    }
}
