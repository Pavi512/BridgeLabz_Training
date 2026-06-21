package com.bridgelabz.coreprograms;

public class PowerOfTwo {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if(n<0 || n>=31){
            System.out.println("Enter a integer between 0 and 30");
            return;
        }

        int pow = 1;

        for(int i=0; i<=n; i++){
            System.out.println("2^" + i + " = " + pow);
            pow = pow * 2;
        }
    }
}
