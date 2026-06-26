package com.bridgelabz.employeewageproblem;

//Employee wage builder class for multiple companies
class EmpWageBuilder{
    CompanyEmpWage[] arr=new CompanyEmpWage[4];
    public EmpWageBuilder() {
        arr[0] = new CompanyEmpWage("TCS",20, 100, 30);
        arr[1] = new CompanyEmpWage("Infosys",40, 150, 25);
        arr[2] = new CompanyEmpWage("Wipro",55, 200, 10);
        arr[3] = new CompanyEmpWage("Deloitte", 40, 50, 15);
    }

    //Method to calculate wages
    public void calculateWages(){
        for(CompanyEmpWage a : arr){
            a.computeEmpWage();
        }
    }
    //Method to display wages
    public void displayWages(){
        for(CompanyEmpWage a : arr) {
            a.display();
        }
    }
}


//Class to calculate company employee wages
class CompanyEmpWage {

    private String company;
    private int ratePerHour;
    private int maxHours;
    private int maxDays;
    private int totalWage;

    //Parameterized constructor
    public CompanyEmpWage(String company, int ratePerHour,
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
public class UC10_EmployeeWage {
    public static void main(String[] args){
        EmpWageBuilder ewb = new EmpWageBuilder();
        ewb.calculateWages();
        ewb.displayWages();
    }
}
