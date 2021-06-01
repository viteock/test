package OfficeHours.Practice_03_22_2021;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Enter your name");
        input.nextLine();
        String name = input.nextLine();
        String name2 = input.nextLine();
        int number2 =input.nextInt();
        input.nextLine();
        String name3 = input.nextLine();

        System.out.println("number = " + number);
        System.out.println("name = " + name);
        System.out.println("name2 = " + name2);
        System.out.println("number2 = " + number2);
        System.out.println("name3 = " + name3);
    }
}
