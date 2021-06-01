package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {

        double balance =345.55;

        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.15;

        double taxProcentage = 0.07;
        double total = price1 + price2 + price3;
        double tax = total * taxProcentage;
        double grandTotal = total + tax;

        double remainingBalance = balance - grandTotal;

        System.out.println("Your initial balance: " + balance);
        System.out.println("Total: " + total);
        System.out.println("Tax: " + tax);
        System.out.println("Your remaining balance: " + remainingBalance);

        int balanceWithNoCents = (int)remainingBalance ;
        System.out.println(balanceWithNoCents);

    }
}
