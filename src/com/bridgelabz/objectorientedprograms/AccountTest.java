package com.bridgelabz.objectorientedprograms;

import java.util.Scanner;

//// Account class to represent a bank account
class Account{
    //Private variable to store balance
    private int bal;

    //Parameterized constructor to initialize balance
    public Account(int bal){
        this.bal = bal;
    }

    //Instance method to debit amount from the account
    public void debitAmount(int debit){
        // Check if debit amount is greater than available balance
        if(debit > bal){
            System.out.println("Debit amount exceeded account balance.");
        }
        else{
            // Deduct the amount from the balance
            bal = bal - debit;
            System.out.println("Balance after debiting : " + bal);
        }
    }
}

// Main class to test the Account
public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter initial account balance
        System.out.println("Enter the balance in your Account : ");
        int amt = sc.nextInt();

        //Create Account object
        Account a = new Account(amt);

        // Ask the user to enter the debit amount
        System.out.println("Enter the amount to be debited : ");
        int debit = sc.nextInt();

        // Call debitAmount method to perform debit operation
        a.debitAmount(debit);
    }
}
