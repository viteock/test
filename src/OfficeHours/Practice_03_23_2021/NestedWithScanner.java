package OfficeHours.Practice_03_23_2021;

import java.util.Scanner;

public class NestedWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Enter a single word");
            String word = sc.next();
            if (!(word.length() % 2 == 1)) {
                System.out.println(word + " is even length");
            } else {
                System.out.println(word + " is odd length");
            }
        } else {
            System.out.println("Enter a character:");
            char letter = sc.next().charAt(0);

            /*
        [Character Checker]
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase
        'G' --> uppercase 'O' --> uppercase
        Hint: Use the ASCII table
             */

            if (letter >= 'A' && letter <= 'Z') {
                System.out.println(letter + " is a uppercase letter");
            } else if (letter >= 'a' && letter <= 'z') {
                System.out.println(letter + " is a lowercase letter");
            } else {
                System.out.println(letter + " in not a valid letter");
            }

            if(letter >= 'A' && letter <= 'Z') { // if(letter >= 65 && letter <= 90) {
                System.out.println(letter + " is a uppercase letter");
            } else if(letter >= 'a' && letter <= 'z'){ //} else if(letter >= 97 && letter <= 122){
                System.out.println(letter + " is a lowercase letter");
            } else {
                System.out.println(letter + " is not a valid letter");
            }

        }
    }
}
