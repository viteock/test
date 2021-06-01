package day09_scanner_practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("##### F to C Converter Program #####");
        System.out.println("Enter Fahrenheit value:");
        double fahrenheitValue = input.nextDouble();
        double celsiusValue = (fahrenheitValue - 32) * 5 / 9;
        DecimalFormat df1 = new DecimalFormat("#.##");
        System.out.println(fahrenheitValue + "F is " + df1.format(celsiusValue) + " C");

    }
}
