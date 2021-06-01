package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate = calc.nextDouble();
        double weeklyPay = hourlyRate * 40 ;
        double monthlyPay = weeklyPay * 52 / 12; //weeklyPay * 4
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("Monthly pay: " +monthlyPay);
        System.out.println("Annual pay: " + annualPay);

        System.out.println("enter 2 numbers:");
        int num1 = calc.nextInt();
        int num2 = calc.nextInt();

        System.out.println("a+b=" + num1 + num2);
        System.out.println(num1 + num2);



    }
}
