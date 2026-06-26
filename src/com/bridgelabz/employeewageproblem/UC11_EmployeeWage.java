package com.bridgelabz.employeewageproblem;

//Interface of employee wage builder
interface EmployeeWageBuilderInterface {

    void calculateWages();
    void displayWages();
}

//Employee wage builder class for multiple companies that implements interface
class EmployeeWageBuilder implements EmployeeWageBuilderInterface{
    CompanyEmployeeWage[] arr=new CompanyEmployeeWage[4];
    public EmployeeWageBuilder() {
        arr[0] = new CompanyEmployeeWage("TCS",20, 100, 30);
        arr[1] = new CompanyEmployeeWage("Infosys",40, 150, 25);
        arr[2] = new CompanyEmployeeWage("Wipro",55, 200, 10);
        arr[3] = new CompanyEmployeeWage("Deloitte", 40, 50, 15);
    }

    //Overridden method to calculate wages
    @Override
    public void calculateWages(){
        for(CompanyEmployeeWage a : arr){
            a.computeEmpWage();
        }
    }
    //Overridden method to display wages
    @Override
    public void displayWages(){
        for(CompanyEmployeeWage a : arr) {
            a.display();
        }
    }
}

//Class to calculate company employee wages
class CompanyEmployeeWage {

    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    //Parameterized constructor
    public CompanyEmployeeWage(String company, int ratePerHour,
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
public class UC11_EmployeeWage {
    public static void main(String[] args){
        EmployeeWageBuilderInterface ewb = new EmployeeWageBuilder();
        ewb.calculateWages();
        ewb.displayWages();
    }
}
