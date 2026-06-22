package com.bridgelabz.snakeandladder;

public class SnakeAndLadderUC5 {

    public static void main(String[] args) {

        int position = 0;

        while(position < 100) {

            int dice = (int)(Math.random() * 6) + 1;
            int option = (int)(Math.random() * 3);

            switch(option) {

                case 0:
                    break;

                case 1:
                    if(position + dice <= 100)
                        position += dice;
                    break;

                case 2:
                    position -= dice;

                    if(position < 0)
                        position = 0;
            }
        }

        System.out.println("Player Won");
    }
}
