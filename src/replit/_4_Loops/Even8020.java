package replit._4_Loops;

public class Even8020 {
    public static void main(String[] args) {
        int a = 80;
        int b = 20;

        String allEven = "";
        while (a >= b) {
            if (a % 2 == 0) {
                allEven += a + " ";
            }
            a--;
        }
        System.out.print(allEven.trim());
    }
}
