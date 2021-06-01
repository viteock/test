package aHomework;
import java.util.Scanner;
public class AgeToDays {
    public static void main(String[] args) {
         int myAge, daysInYear, ageInDays;
         Scanner age = new Scanner(System.in);
        System.out.println("Enter your age (years):");
        myAge = age.nextInt();
        System.out.println("How many days are in a year?");
        daysInYear = age.nextInt();
        ageInDays = myAge * daysInYear;

        //Printing
        System.out.println("You are " + myAge + " years old or " +
                ageInDays + " days old.");
        System.out.println("END");
    }
}
