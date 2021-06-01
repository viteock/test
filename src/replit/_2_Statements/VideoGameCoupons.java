package replit._2_Statements;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        // copy from
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = sc.nextInt();
        if (coupons > 3) {
            if (coupons >= 10) {
                int candyBars = coupons / 10;
                int gumball = (coupons % 10) / 3;
                System.out.println("Number of Candies: " + candyBars);
                System.out.print("Number of Gumballs: " + gumball);
            } else {
                int candyBars = 0;
                int gumball = coupons / 3;
                System.out.println("Number of Candies: " + candyBars);
                System.out.print("Number of Gumballs: " + gumball);
            }
        }else {
            System.out.print("Not enough coupons");
        }
    }
}