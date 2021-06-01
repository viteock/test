package replit._5_Arrays;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "I am krasav4ik";

        //copy from
        String[] words = sentence.split(" ");
        for (String each : words) {
            System.out.println(each);
        }
    }
}
