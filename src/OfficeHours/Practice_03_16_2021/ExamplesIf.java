package OfficeHours.Practice_03_16_2021;

import java.util.Scanner;

public class ExamplesIf {
    public static void main(String[] args) {

        int a = 10;
        int b = a-- * 2 - --a % 2 + a;
        //      10 * 2 - 8 % 2 + 8
        //        20 - 8 % 2 + 8

        System.out.println(b);

        //even and odd

        if (11 % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        String result =  (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("result = " + result);
        System.out.println(-22%7);
    }
}
