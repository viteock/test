package replit._3_String;

public class MergeThem {
    public static void main(String[] args) {
        String word1 = "qava";
        String word2 = "wow";

        //copy from
        if ((word1.length() != 3) || (word2.length() != 3)) {
            System.out.print("cannot merge");
        } else {
            int a = 0;
            System.out.print("" + word1.charAt(a) + word2.charAt(a) + word1.charAt(++a)
                    + word2.charAt(a) + word1.charAt(++a) + word2.charAt(a));
        }
    }
}
