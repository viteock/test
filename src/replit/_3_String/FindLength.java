package replit._3_String;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {

        //copy from
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String text = sc.nextLine();
        System.out.print("length is: " + text.length());
        System.out.println();
        int textInt = text.length();
        
        text = text.toUpperCase();

        System.out.println("textInt = " + textInt);
        System.out.println("text = " + text);
        
        
    }
}
