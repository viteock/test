package replit._2_Statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        //copy from
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cents:");
        int centsValue = sc.nextInt();

        if (centsValue > 0 && centsValue < 100) {
            int quartersAmount = centsValue / 25;
            int valueAfterQuarters = centsValue % 25;
            int dimesAmount = valueAfterQuarters / 10;
            int valueAfterDimes = valueAfterQuarters % 10;
            int nickelsAmount = valueAfterDimes / 5;
            int valueAfterNickels = valueAfterDimes % 5;
            int penniesAmount = valueAfterNickels / 1;

            System.out.println("Your change is " + quartersAmount + " quarters, " + dimesAmount +
                    " dimes, " + nickelsAmount + " nickels, and " + penniesAmount + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }
    }
}
