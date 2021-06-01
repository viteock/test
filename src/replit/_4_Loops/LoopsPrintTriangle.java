package replit._4_Loops;

public class LoopsPrintTriangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int n = 5;

        String print = "";
        for(i = 1 ; i <= n ; i++) {
            print += "*";
            System.out.println(print);
        }
    }
}
