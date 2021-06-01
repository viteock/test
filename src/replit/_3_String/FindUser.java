package replit._3_String;

import java.util.Scanner;

public class FindUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //copy from
        System.out.println("Enter full name:");
        String name = scan.nextLine();

        if (name.equalsIgnoreCase("Max Payne") || "Alan Wake".equalsIgnoreCase(name)) {
            System.out.print("User found!");
        } else {
            System.out.print("User not found!");
        }
    }
}
