package replit._5_Arrays;

public class FindingMaxLength {
    public static void main(String[] args) {
        String[] words = {"apple", "coldwater", "resistance", "rise"};

        // copy from
        String longestWord = "";
        for (String each : words) {
            if (each.length() > longestWord.length()) {
                longestWord = each;
            }
        }
        System.out.print(longestWord);
    }
}
