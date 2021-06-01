package day14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 and number 2:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Enter operator :\n +, -, *, /, %");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid Operator - " + operator);
        }
    }
}
