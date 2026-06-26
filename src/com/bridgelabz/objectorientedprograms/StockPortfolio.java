package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.Scanner;

class Stock{
    String shareName;
    int shares;
    int sharePrice;

    public Stock(String shareName, int shares, int sharePrice){
        this.shareName = shareName;
        this.shares = shares;
        this.sharePrice = sharePrice;
    }

    public int stockValue(int shares, int sharePrice){
        return shares*sharePrice;
    }
}

public class StockPortfolio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Stocks : ");
        int n = sc.nextInt();

        sc.nextLine();

        ArrayList<Stock> stockList = new ArrayList<>();
        for (int i=0; i<n; i++){
            System.out.println("Enter share name of stock "+ (i+1) + ": ");
            String shareName = sc.nextLine();

            System.out.println("Enter number of shares of stock " + (i+1) + ": " );
            int shares = sc.nextInt();

            System.out.println("Enter share price of stock "+ (i+1) + ": ");
            int sharePrice = sc.nextInt();

            sc.nextLine();

            Stock s = new Stock(shareName, shares, sharePrice);

            stockList.add(s);
        }
        System.out.println("\nStock Report : ");
        int totalStockValue = 0;
        for (Stock eachStock : stockList){
            int eachStockValue = eachStock.stockValue(eachStock.shares, eachStock.sharePrice);
            System.out.println("\nShare name : " + eachStock.shareName + "\nTotal stock value : " + eachStockValue);
            totalStockValue = totalStockValue + eachStockValue;
        }
        System.out.println("\nTotal stock value of all shares : " + totalStockValue);
    }
}
