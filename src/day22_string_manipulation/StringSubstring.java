package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "aloha hawaii";

        System.out.println(word.substring(2, 10));
        System.out.println(word.substring(5, 11));
        System.out.println(word.substring(0, 4));

        String today = "i learned [java] today";

        /**
         * find indexOf [
         * find index ]
         * print java
         */
        int result = today.indexOf("[");
        int result2 = today.indexOf("]");
        System.out.println(today.substring(result +1 , result2));
    }
}
