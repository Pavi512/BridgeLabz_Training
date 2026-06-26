package com.bridgelabz.snakeandladder;

public class SnakeAndLadderUC7 {
    static int player1 = 0;
    static int player2 = 0;

    public static int playTurn(int playerNum) {

        int dice = (int)(Math.random() * 6) + 1;
        int option = (int)(Math.random() * 3);

//        System.out.println("Player " + playerNum + " rolled " + dice);

        switch(option) {

            case 0:
                break;

            case 1:
//                System.out.println("Ladder");

                if(playerNum == 1){
                    if(player1 + dice <= 100) {
                        player1 += dice;
                    }
//                    System.out.println("Player 1 Position = " + player1);
                }
                else{
                    if(player2 + dice <= 100){
                        player2 += dice;
                    }
//                    System.out.println("Player 2 Position = " + player2);
                }
                break;

            case 2:
//                System.out.println("Snake");

                if(playerNum == 1){
                    player1 -= dice;
                    if(player1 < 0){
                        player1 = 0;
                    }
//                    System.out.println("Player 1 Position = " + player1);
                }
                else{
                    player2 -= dice;
                    if(player2 < 0){
                        player2 = 0;
                    }
//                    System.out.println("Player 2 Position = " + player2);
                }
                break;
        }

        return option;
    }

    public static void main(String[] args) {

        int option;

        while(player1 < 100 && player2 < 100) {

            do{
                option = playTurn(1);
                if(player1 == 100) {
                    System.out.println("Player 1 Won");
                    return;
                }
            } while (option == 1);

            do{
                option = playTurn(2);
                if(player2 == 100) {
                    System.out.println("Player 2 Won");
                    return;
                }
            } while (option == 1);
        }
    }
}
