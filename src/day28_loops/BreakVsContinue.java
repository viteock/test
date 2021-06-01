package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        //BREAK STATEMENT
        for(int n = 1; n <= 5; n++) {
            System.out.println(n);
            if (n == 3) {
                break;
            }
        }
        System.out.println();
        //CONTINUE
        for(int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println(n);

        }
    }
}
