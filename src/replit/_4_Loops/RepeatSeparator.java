package replit._4_Loops;

public class RepeatSeparator {
    public static void main(String[] args) {
        String word = "Word";
        String separator = "X";
        int count = 3;

        //copy from
        String newWord = "";
        for(int i = 1; i <= count; i++) {
            newWord += word;
            if (i != count) {
                newWord += separator;
            }
        }
        System.out.print(newWord);
    }
}
