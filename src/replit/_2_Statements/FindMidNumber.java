package replit._2_Statements;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {
        // copy from
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, mediumValue;
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        System.out.println("Enter third number:");
        num3 = sc.nextInt();
        //
        if(num1 < num2 && num1 < num3) {
            if(num2 < num3) {
                mediumValue = num2;
            }else {
                mediumValue = num3;
            }
        }else {
            mediumValue = num1;
        }
        System.out.println("Medium value is: " + mediumValue);
    }
}
