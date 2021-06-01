package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month:");
        double rent = scan.nextDouble();
        scan.nextLine();         //bug-fix //work-around                   // bug resolved
        String month = scan.nextLine();

        System.out.println("rent = " + rent);
        System.out.println("month = " + month);

        System.out.println("Enter blabla");
        String blabla = scan.nextLine();
        String blabla1 = scan.nextLine(); // works fine


        System.out.println("blabla = " + blabla);
        System.out.println("blabla1 = " + blabla1);
    }
}
