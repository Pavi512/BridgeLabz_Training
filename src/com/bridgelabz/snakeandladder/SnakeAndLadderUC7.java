package com.bridgelabz.snakeandladder;

public class SnakeAndLadderUC7 {

    public static int playTurn(int position) {

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

        return position;
    }

    public static void main(String[] args) {

        int player1 = 0;
        int player2 = 0;

        while(player1 < 100 && player2 < 100) {

            player1 = playTurn(player1);

            if(player1 == 100) {
                System.out.println("Player 1 Won");
                break;
            }

            player2 = playTurn(player2);

            if(player2 == 100) {
                System.out.println("Player 2 Won");
                break;
            }
        }
    }
}
