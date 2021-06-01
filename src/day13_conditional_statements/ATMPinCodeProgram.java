package day13_conditional_statements;

import java.util.Scanner;

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        int secretPincode = 2233;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your PIN code :");
        int inputPincode = sc.nextInt();

        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        } else {
            System.out.println("Incorrect pincode! :" + inputPincode);
            System.out.println("Please  try again!");
        }
        System.out.println();
        System.out.println("Thank you for using TD Bank ATM!");
    }
}
