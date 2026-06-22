package com.bridgelabz.snakeandladder;

public class SnakeAndLadderUC6 {

    public static void main(String[] args) {

        int position = 0;
        int count = 0;

        while(position < 100) {

            int dice = (int)(Math.random() * 6) + 1;
            int option = (int)(Math.random() * 3);

            count++;

            switch(option) {

                case 0:
                    System.out.println("No Play");
                    break;

                case 1:
                    if(position + dice <= 100)
                        position += dice;
                    System.out.println("Ladder");
                    break;

                case 2:
                    position -= dice;

                    if(position < 0)
                        position = 0;

                    System.out.println("Snake");
                    break;
            }

            System.out.println("Dice = " + dice +
                    " Position = " + position);
        }

        System.out.println("Total Dice Rolls = " + count);
    }
}
