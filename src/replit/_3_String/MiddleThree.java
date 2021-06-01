package replit._3_String;

public class MiddleThree {
    public static void main(String[] args) {
        String word = "iphones";

        //copy from
        if (!(word.length() > 5) || word.length() % 2 == 0) {
            System.out.print("invalid");
        } else {
            int start = word.length() / 2 - 1;
            int end = word.length() / 2 + 2;
            System.out.print(word.substring(start, end));
        }
    }
}
