package day12_conditional_statements;

import java.util.Scanner;

public class  AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price:");
        double itemPrice = scan.nextDouble();

        if (itemPrice >= 25) {
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total: $" + itemPrice);

        } else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total : $" +
                    itemPrice + ". Less than minimum of 25$.");
        }
    }
}
