package replit._4_Loops;

public class PrintVowels {
    public static void main(String[] args) {
        String word = "asuifgdjksbvjsdovxcjbvsaaaxcxcuee";

        String allvowels = "aeiou";
        String vowelsFromWord = "";
        for(int i = 0; i < word.length() ; i++) {
            if(allvowels.contains(word.charAt(i) + "")) {
                vowelsFromWord += "" + word.charAt(i);
            }
        }
        System.out.print(vowelsFromWord);
    }
}
