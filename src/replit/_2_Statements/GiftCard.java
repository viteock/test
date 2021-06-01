package replit._2_Statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balanceLeft, balance = 100;
        //input
        String purchasedItem = sc.nextLine();

        if (purchasedItem.equals("Blanket")) {
            balanceLeft = balance - 60;
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: " + balanceLeft + "$");
        } else if (purchasedItem.equals("Charger") || purchasedItem.equals("Hat")) {
            balanceLeft = balance - 25;
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: " + balanceLeft + "$");
        } else if (purchasedItem.equals("Headphones")) {
            balanceLeft = balance - 30;
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: " + balanceLeft + "$");
        } else if (purchasedItem.equals("Pants")) {
            balanceLeft = balance - 50;
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: " + balanceLeft + "$");
        } else if (purchasedItem.equals("Pillow")) {
            balanceLeft = balance - 40;
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: " + balanceLeft + "$");
        } else if (purchasedItem.equals("Laptop") || purchasedItem.equals("Smartphone")) {
            System.out.print("Sorry, not enough funds on your gift card!");
        } else if (purchasedItem.equals("Socks")) {
            balanceLeft = balance - 5;
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: " + balanceLeft + "$");
        } else if (purchasedItem.equals("USB cable")) {
            balanceLeft = balance - 10;
            System.out.println("Thank you for your purchase!");
            System.out.print("Your current balance is: " + balanceLeft + "$");
        } else {
            System.out.print("Invalid item!");
        }
    }
}
