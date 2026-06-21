package com.bridgelabz.junittesting;

import java.util.Scanner;

public class Binary {

    public static String toBinary(int number) {

//        String binary = Integer.toBinaryString(number);

        String binary = "";

        while(number>0){
            binary = (number%2) + binary;
            number = number/2;
        }

        while (binary.length() < 8) {
            binary = "0" + binary;
        }

        return binary;
    }

    public static int swapNibbles(int number) {

        return ((number & 0x0F) << 4) |
                ((number & 0xF0) >> 4);
    }

    public static boolean isPowerOfTwo(int number) {

        return number > 0 &&
                (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String binary = toBinary(number);

        System.out.println("Binary = " + binary);

        int swappedNumber = swapNibbles(number);

        String swappedBinary =
                toBinary(swappedNumber);

        System.out.println(
                "Binary After Swapping Nibbles = "
                        + swappedBinary);

        System.out.println(
                "Decimal After Swapping = "
                        + swappedNumber);

        if (isPowerOfTwo(swappedNumber)) {
            System.out.println(
                    swappedNumber +
                            " is a Power of 2");
        } else {
            System.out.println(
                    swappedNumber +
                            " is not a Power of 2");
        }
    }
}
