package OfficeHours.Practice_03_16_2021;

import java.util.Scanner;

public class BMI {
    /**
     * BMI: Program will ask user to enter their mass (kilogram) and their height (meters). Calculate their BMI and then print the appropriate message based on the provided values: All numbers taken as doubles
     * —> BMI Formula: BMI = mass / height^2
     * —> Values:
     * Less than 18.5 — Underweight
     * From 18.5 to 25 — Normal weight
     * From 25 to 30 — Overweight
     * More than or equal to 30 — Obese
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight:");
        double mass = sc.nextDouble();
        System.out.println("Please enter your height:");
        double height = sc.nextDouble();
        double BMI = mass / (height * height);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Normal weight");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        System.out.println(BMI);
    }
}

