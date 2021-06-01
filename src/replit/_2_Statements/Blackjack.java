package replit._2_Statements;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        //copy from
        Scanner sc = new Scanner(System.in);
        int housePoints = sc.nextInt();
        int playerPoints = sc.nextInt();
        //if statements
        if (playerPoints > 21) {
            System.out.print("player bust");
        } else if (housePoints > playerPoints) {
            System.out.print("player loss");
        } else if (housePoints == playerPoints) {
            System.out.print("its a tie");
        } else {
            System.out.print("player win");
        }
    }

}
