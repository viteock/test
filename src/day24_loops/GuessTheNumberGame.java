package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
//        System.out.println(random.nextInt(101));
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(101);
        int guessingNUmber = 0;
        int attempt = 0;

        do {
            System.out.println("Guess the secret number");
            guessingNUmber = scan.nextInt();
            if (guessingNUmber > secretNumber) {
                System.out.println("Your number is too large");
            } else if (guessingNUmber < secretNumber) {
                System.out.println("Your number is too small");
            }
            attempt++;
        } while (guessingNUmber != secretNumber && attempt <= 5);


        String result = (guessingNUmber == secretNumber) ? "You won" : "You lost";
        System.out.println(result);

    }
}
