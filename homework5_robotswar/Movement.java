package homework5_robotswar;

import java.util.Scanner;

abstract class Movement {
    String cl = "Ячейка занята";

    public void goTop(Player player) {
        player.pair.search(player);
        if (player.field[player.pair.getIndex1()- (1 + player.getCellsI())][player.pair.getIndex2()].equals(Game.EMPTY)) {
            player.pair.delete(player);
            player.field[player.pair.getIndex1() - (1 + player.getCellsI())][player.pair.getIndex2()] = player.symbol;
        }else System.out.println(cl);
    }

    public void goLeft(Player player){
        player.pair.search(player);
        if (player.field[player.pair.getIndex1()][player.pair.getIndex2()-1].equals(Game.EMPTY)) {
            player.pair.delete(player);
            player.field[player.pair.getIndex1()][player.pair.getIndex2() - 1] = player.symbol;
        }else System.out.println(cl);
    }

    public void goRight(Player player){
        player.pair.search(player);
        if (player.field[player.pair.getIndex1()][player.pair.getIndex2()+1].equals(Game.EMPTY)) {
            player.pair.delete(player);
            player.field[player.pair.getIndex1()][player.pair.getIndex2() + 1] = player.symbol;
        }else System.out.println(cl);
    }

    public void goDown(Player player){
        player.pair.search(player);
        if (player.field[player.pair.getIndex1() + 1][player.pair.getIndex2()].equals(Game.EMPTY)) {
            player.pair.delete(player);
            player.field[player.pair.getIndex1() + 1][player.pair.getIndex2()] = player.symbol;
        }else System.out.println(cl);
    }


    public void firstMove(Player player) {
        System.out.println("Первый ход робота: " + player.name);
        System.out.println("Enter row");
        int row = new Scanner(System.in).nextInt();
        System.out.println("Enter col");
        int col = new Scanner(System.in).nextInt();
        player.field[row][col] = player.symbol;
    }


}

class Pair{

    int index1 = 0;
    int index2 = 0;

    public void setIndex1(int index1) {
        this.index1 = index1;
    }

    public void setIndex2(int index2) {
        this.index2 = index2;
    }

    public int getIndex1() {
        return index1;
    }

    public int getIndex2() {
        return index2;
    }

    public void search(Player player) {
        for (int i = 0; i < player.field.length; i++) {
            for (int j = 0; j < player.field.length; j++) {
                if (player.field[i][j].equals(player.symbol)) {
                    index1 = i;
                    index2 = j;
                }
            }
        }
    }

    public void delete(Player player){
        player.field[getIndex1()][getIndex2()] = Game.EMPTY;
    }
}

