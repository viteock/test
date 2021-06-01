package replit._4_Loops;

public class Factorial {
    public static void main(String[] args) {
        int n = 16;
        long factorial = 1;

        while (n > 0) {
            factorial *= n--;
        }
        System.out.println(factorial);
    }
}