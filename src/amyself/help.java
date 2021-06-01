package amyself;
import java.util.Scanner;
public class help {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int quaters = cents / 25;
        int remainingCentsAfterQuaters = cents % 25;
        int dimes = remainingCentsAfterQuaters / 10;
        int remainingCentsAfterDimes = remainingCentsAfterQuaters % 10;
        int nickels = remainingCentsAfterDimes / 5;
        int pennies = nickels % 5;

        if (cents > 0 && cents < 100) {
            System.out.println("Your change is " + quaters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies +" pennies");
        } else {
            System.out.println("Invalid cents amount");
        }


    }
}