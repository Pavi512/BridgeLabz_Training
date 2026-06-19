package com.bridgelabz.basicprograms;
/*
Near the Run Button (▶) at the top-right:

Click the dropdown arrow
Click Edit Configurations

You'll see a window like:

Name: SumCommandLineArgs
Main class: com.bridgelabz.basicprograms.SumCommandLineArgs
Program arguments: [Empty]

Step 1: Enter Arguments

In Program arguments, type:
        5 hello 15 world 25

Step 2: Apply and Run

Click:

Apply → OK

Now click:

        ▶ Run
*/

public class SumCommandLineArgs {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Number of invalid integers: " + invalidCount);
    }
}