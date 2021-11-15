package homework5_robotswar;

import lesson5_tic_tac_toe.ComputerKiller;
import lesson5_tic_tac_toe.ComputerPlayer;
import lesson5_tic_tac_toe.HumanPlayer;

import java.util.Scanner;

public class Game extends Movement{
    String[][] board = new String[20][20];
    final static String EMPTY = "|  |";
    final static String A = "| A |";
    final static String B = "| B |";
    final static String E = "| E |";

    public  Game(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                board[i][j] = EMPTY;
            }
        }
    }

    public void startGame() {
        Scanner scn = new Scanner(System.in);
        Player player1;
        Player player2;
        String input;
        player1 = new RobotA(A, board, A);
        player2 = new RobotA(B,board,B);
        firstMove(player1);
        firstMove(player2);
        print();
        Player currPlayer = player1;
        Player oppositePlayer = player2;

        while(true) {
            System.out.println("Ход игрока: " + oppositePlayer.name);
            System.out.println(
                    "w. Идти вверх\n" +
                    "s. Идти вниз\n"+
                    "a. Идти влево\n" +
                    "d. Идти вправо\n");
            input = scn.nextLine();
            if (input.equalsIgnoreCase("d")){
                goRight(oppositePlayer);
                print();
            }
            if (input.equalsIgnoreCase("a")){
                goLeft(oppositePlayer);
                print();
            }
            if (input.equalsIgnoreCase("w")){
                goTop(oppositePlayer);
                print();
            }
            if (input.equalsIgnoreCase("s")){
                goDown(oppositePlayer);
                print();
            }
            Player tmp = currPlayer;
            currPlayer = oppositePlayer;
            oppositePlayer = tmp;
        }
    }


    public  void print(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


}
