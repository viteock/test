package replit._3_String;

public class PrintHalfTwice {
    public static void main(String[] args) {
        String word = "java";

        //copy from
        int halfNum = word.length() / 2;
        System.out.print(word.substring(0 , halfNum) + word.substring(0 , halfNum));
        System.out.println();
        String txt = "abc";
        System.out.print(txt.substring(0, txt.length() - 1));
    }
}
