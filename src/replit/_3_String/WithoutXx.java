package replit._3_String;

public class WithoutXx {
    public static void main(String[] args) {
        String word = "javaX";

        if (word.toLowerCase().endsWith("x") || word.toLowerCase().startsWith("x")) {
            if (word.toLowerCase().endsWith("x")) {
                word = word.substring(0, word.length() - 1);
            }
            if (word.toLowerCase().startsWith("x")) {
                word = word.substring(1);
            }
        }
        System.out.println(word);

    }
}
