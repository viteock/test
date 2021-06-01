package day11_comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        int num1, num2;

        //  PRE-INCREMENT
        num1 = 4;
        num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // POST-INCREMENT

        /* int num3 = 7;
        int num4 = num3;
        num3++;
         */

        int num3 = 7;
        int num4 = num3++;
        System.out.println("num1 = " + num3);
        System.out.println("num2 = " + num4);


    }
}
