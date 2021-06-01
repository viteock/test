package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {

        int cents = 123;
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("in " + cents + " cents we have " + dollars +
                " dollars and " + remainingCents + " cents");




      Scanner money = new Scanner(System.in);
        System.out.println("Enter cents what you have:");
        int cents1 = money.nextInt();
        int dollars1 = cents1 / 100;
        int remainingCents1 = cents1 % 100;
        System.out.println("in " + cents1 + " cents we have " + dollars1 +
                " dollars and " + remainingCents1 + " cents");

    }
}
