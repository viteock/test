package day24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretPinCode = 1234;
        int pinCode ;

        do {
            System.out.println("Enter pincode:");
            pinCode = sc.nextInt();
        }while(secretPinCode != pinCode);
        System.out.println("correct pincode" );
    }
}
