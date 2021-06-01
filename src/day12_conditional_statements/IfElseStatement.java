package day12_conditional_statements;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b;
        boolean result;
        System.out.println("Enter number for a:");
        a = num.nextInt();
        System.out.println("Enter number for b:");
        b = num.nextInt();

        if (a == b) {
            System.out.println("a = b");
        } else {
            if (a > b) {
                System.out.println("a is bigger than b");
            } else {
                System.out.println("b is bigger than a");
            }
            result = b < a;
            if (result) {
                System.out.println("b is smaller");
            } else {
                System.out.println("b is bigger");
            }

        }
    }
}