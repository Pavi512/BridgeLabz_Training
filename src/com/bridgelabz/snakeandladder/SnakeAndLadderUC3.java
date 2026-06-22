package com.bridgelabz.snakeandladder;

public class SnakeAndLadderUC3 {

    public static void main(String[] args) {

        int position = 0;

        int dice = (int)(Math.random() * 6) + 1;
        int option = (int)(Math.random() * 3);

        switch(option) {

            case 0:
                System.out.println("No Play");
                break;

            case 1:
                position += dice;
                System.out.println("Ladder");
                break;

            case 2:
                position -= dice;
                System.out.println("Snake");
                break;
        }

        System.out.println("Position = " + position);
    }
}
