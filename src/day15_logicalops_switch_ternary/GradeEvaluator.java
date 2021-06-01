package day15_logicalops_switch_ternary;

import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade:");
        char grade = sc.next().charAt(0);

        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Pass. with grade - " + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade - " + grade);
        } else if (grade == 'E') {
            System.out.println("Fail. Grade - " + grade);
        } else {
            System.out.println("Invalid Grade - " + grade);
        }

        System.out.println("Enter the grade one more time:");
        grade = sc.next().charAt(0);
        if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b'
                || grade == 'C' || grade == 'c') {
            System.out.println("Pass. with grade - " + grade);
        } else if (grade == 'D' || grade == 'd') {
            System.out.println("Qualify for retake. Grade - " + grade);
        } else if (grade == 'E' || grade == 'e') {
            System.out.println("Fail. Grade - " + grade);
        } else {
            System.out.println("Invalid Grade - " + grade);
        }


    }
}
