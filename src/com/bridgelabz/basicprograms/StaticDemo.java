package com.bridgelabz.basicprograms;

public class StaticDemo {
    static int num;

    static{
        System.out.println("Static block");
    }

    static void display(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        System.out.println("Static variable : " + StaticDemo.num);
        StaticDemo.display();
    }
}
