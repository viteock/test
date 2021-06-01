package replit._3_String;

public class ReverseIt {
    public static void main(String[] args) {
        String word = "nomel";

        //copy from
        if(word.length() != 5) {
            if(word.length() > 5) {
                System.out.print("Too long!");
            }else {
                System.out.print("Too short!");
            }
        }else {
            System.out.print("" + word.charAt(4) + word.charAt(3) + word.charAt(2)
                                +word.charAt(1) + word.charAt(0));
        }
    }
}
