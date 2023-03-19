package Pragrammers;

import java.util.*;

public class PracticePage1 {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};

        int[][] boards = new int[board.length+1][board[0].length+1];
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board[0].length; j++) {
                boards[i][j] = board[i - 1][j - 1];
                board[i - 1][j - 1]=0;
            }
        }

        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[0].length; j++) {
                System.out.print(boards[i][j]+" ");

            }
            System.out.println();
        }

    }
}
