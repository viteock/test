package replit._5_Arrays;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        //copy from

        for (int i = 0; i < chessBoard.length; i++) {
            char letters = 'a';
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = "" + (i + 1) + letters;
                letters++;
            }
        }
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
