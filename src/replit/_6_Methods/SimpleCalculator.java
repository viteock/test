package replit._6_Methods;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }

    // Do not touch above

    public static void plus() {

        //your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNum = sc.nextInt();
        System.out.println("enter second number:");
        int secondNum = sc.nextInt();
        int total = firstNum + secondNum;
        System.out.println("result: " + total);


    }
}