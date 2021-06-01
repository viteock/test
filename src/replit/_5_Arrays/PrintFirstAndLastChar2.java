package replit._5_Arrays;

import java.util.Arrays;

public class PrintFirstAndLastChar2 {
    public static void main(String[] args) {
        String[] words = { "asdasfas", "fasfasfsaf", "gfdgdfhj", "pgofhoju"};

        String[] newWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            newWords[i] = "" + words[i].charAt(0) +words[i].charAt(words[i].length() - 1);
        }
        System.out.println(Arrays.toString(newWords));
    }
}
