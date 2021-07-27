package aTeam;

public class LongestSub {
    /*
        Given a String find the biggest substring of chars
        that match and print it.

        Ex: aaabbbcccccddddeeeeeeeeeee
        Output: eeeeeeeeee
         */
    public static void substringMethod(String str) {
        String longestSubstring = "";
        String temp = "";

        for ( int i = 0; i < str.length() - 1; i++ ) {
            temp += str.charAt(i);
            if (str.charAt(i) != str.charAt(i + 1) || i == str.length() - 2) {
                if (i == str.length() - 2 && str.charAt(i) == str.charAt(i + 1)) {
                    /* The reason I did i== str.length()-2 in the statement is
                    so the characters are only checked in the 2nd to last index.
                    In other iterations the str.charAt(i) == str.charAt(i+ 1))part won't be checked*/
                    temp += str.charAt(i + 1);
                }
                if (temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;
                }
                temp = "";
            }
        }

        System.out.println("Longest substring: " + longestSubstring);
    }

}
