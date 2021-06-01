package replit._4_Loops;

public class PrintEven {
    public static void main(String[] args) {

        //copy from
        int a = 80;
        int b = 20;

        while (a >= b) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a--;
        }

    }
}
