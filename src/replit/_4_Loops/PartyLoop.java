package replit._4_Loops;

import java.util.Scanner;

public class PartyLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //copy from
        String guestList = "";
        String newGuest = "";
        do {
            System.out.println("Please enter guest name:");
            guestList += input.next();
            System.out.println("Do you want to enter new guest name:");
            newGuest = input.next();
            if (newGuest.equals("yes")) {
                guestList += ", ";
            }
        } while (newGuest.equals("yes"));
        System.out.print("Guest's list: " + guestList);
    }
}
