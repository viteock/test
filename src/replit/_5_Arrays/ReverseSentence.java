package replit._5_Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";

        //copy from
        String[] sentenceWords = sentence.split(" ");
        for (int i = 0; i < sentenceWords.length / 2; i++) {
            String temp = sentenceWords[i];
            sentenceWords[i] = sentenceWords[sentenceWords.length - 1 - i];
            sentenceWords[sentenceWords.length - 1 - i] = temp;
        }
        String reversedSentence = "";
        for (String eachWord : sentenceWords) {
            reversedSentence += eachWord + " ";
        }
        System.out.println(reversedSentence.trim());
    }
}
