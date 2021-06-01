package replit._6_Methods;

import java.util.Collections;
import java.util.*;

public class Anagram {
    public static boolean isAnagram(String word1, String word2) {
        char[] charArray1 = word1.toLowerCase().replace(" ", "").toCharArray();
        char[] charArray2 = word2.toLowerCase().replace(" ", "").toCharArray();
        if (charArray1.length != charArray2.length) {
            return false;
        }
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("nurses run", "nurse runs"));
        System.out.println("///////");
        System.out.println(isAnagram1("nursesd   run", "nurse    runs"));
    }

    public static boolean isAnagram1(String word1, String word2) {
        word1 = word1.toUpperCase().replace(" ", "");
        word2 = word2.toUpperCase().replace(" ", "");
        if (word1.length() != word2.length()) {
            return false;
        }
        for (int i = 0; i < word1.length(); i++) {
            word2 = word2.replaceFirst("" + word1.charAt(i), "");
        }
        return word2.isEmpty();
    }
}
