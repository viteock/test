package amyself;

import java.util.Scanner;

public class zzzz {
    public static void main(String[] args) {
        Scanner Scanner;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");

        double salary = scan.nextDouble();
        System.out.println("Enter your tax rate");
        double tax = scan.nextDouble();

        double totalTax =   salary * tax;  // 28000
        double salaryAfterTax = salary - totalTax;  //72000

        System.out.println(salaryAfterTax);
    }
    }

