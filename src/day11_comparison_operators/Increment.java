package day11_comparison_operators;

public class Increment {
    public static void main(String[] args) {
         int a, b, c, d;
         a = 5;
         b = 13;
         c = a++ + ++b; // a = 6 b = 14 c = 19;

        a = 26;
        b = 34;
        c = a++ + --b + ++a + b--;

        //a= 28; b = 32; c = 26 + 33 + 27 + 34=d
        d = 26 + 33 + 27 +34;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
