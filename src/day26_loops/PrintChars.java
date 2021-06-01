package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "victor";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(i + 1 + " letter: " + word.charAt(i));
            System.out.println(word.substring(i));
        }
        System.out.println();
        for (int a = word.length() - 1; a >= 0; a--) {
            System.out.println(a + 1 + " letter: " + word.charAt(a));
            System.out.println(word.substring(a));
        }
        System.out.println();
        for(int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}