package replit._3_String;

public class MiddleOne {
    public static void main(String[] args) {
        String word = "iphone";

        if (word.length() % 2 != 0) {
            if (word.length() >= 3) {
                System.out.print(word.charAt(word.length() / 2));
            } else {
                System.out.println(word + word + word);
            }
        } else {
            if (word.length() >= 4) {
                System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
            } else {
                System.out.println(word + word);
            }
        }

    }
}
