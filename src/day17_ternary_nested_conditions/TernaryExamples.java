package day17_ternary_nested_conditions;

import java.util.Scanner;

public class TernaryExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //result
        System.out.println("Enter your score:(1-100)");
        int score = sc.nextInt();
        String result = (score > 50) ? "Good" : "Bad";
        System.out.println("result = " + result);
        //quality
        System.out.println("Enter quality (good or bad):");
        sc.nextLine();
        String quality = sc.nextLine();
        int a = (quality.equals("bad")) ? 0 : 100;
        System.out.println("Quality points:" + a);
        //grade
        System.out.println("Enter your score");
        int score2 = sc.nextInt();
        char grade = (score > 80) ? 'A' : 'B';
        System.out.println("Your grade is : " + grade);
        //evenOdd
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        String evenOdd = (num % 2 == 1) ? "Odd" : "Even";
        System.out.println("Your number " + num + " is " + evenOdd);
    }
}

// String result = (score < 60) ? "Fail" : "Pass";