package replit._6_Methods;

import java.util.*;

public class Signum {
    public static void sign(int n) {
        //your code here
        if (n != 0) {
            System.out.print((n > 0) ? "positive" : "negative");
        } else {
            System.out.print("zero");
        }


    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
}
