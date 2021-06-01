package replit._5_Arrays;

import java.util.*;

public class PrintShortestWord2 {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        //copy from
        String[] strArray = str.split(", ");
        String shortestWord = strArray[0];
        for (String eachStr : strArray) {
            if (eachStr.length() < shortestWord.length()) {
                shortestWord = eachStr;
            }
        }
        String wordsEvenlyShort = "";
        for (String eachStr : strArray) {
            if (eachStr.length() == shortestWord.length()) {
                wordsEvenlyShort += eachStr + "_";
            }
        }
        String[] finalWords = wordsEvenlyShort.split("_");
        Arrays.sort(finalWords);
        System.out.print(Arrays.toString(finalWords));
    }
}
