package day09_scanner_practice;

import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit, currentSpeed, overTheLimit;
        Scanner speed = new Scanner(System.in);
        System.out.println("Enter speed limit:");
        speedLimit = speed.nextInt();
        System.out.println("Enter your speed:");
        currentSpeed = speed.nextInt();
        overTheLimit = currentSpeed - speedLimit;
        if (overTheLimit <= 0) {
            System.out.println("You are a turtle");
        } else {
            System.out.println("Keep speeding up. You will find the ticket");
        }
        System.out.println("Speed over limit: " + overTheLimit);
    }
}