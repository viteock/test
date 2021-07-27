package replit._6_Methods;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {
        char[] game1 = {
                'X', 'X', 'X',
                '-', 'O', '-',
                '-', 'O', '-'
        };
        System.out.println(won(game1));
    }

    public static String won(char[] x) {
        List<String> results = new ArrayList<>();
        for (int i = 0, j = 0; j < x.length; i++, j += 3) {
            results.add("" + x[i] + x[i + 3] + x[i + 6]);
            results.add("" + x[j] + x[j + 1] + x[j + 2]);
            if (i == 0) {
                results.add("" + x[i] + x[i + 4] + x[i + 8]);
            }
            if (i == 2) {
                results.add("" + x[i] + x[i + 2] + x[i + 4]);
            }
        }
        String winner = "";
        if (results.contains("XXX")) {
            winner = "Player X won";
        } else if (results.contains("OOO")) {
            winner = "Player O won";
        }
        return winner;
    }
}
