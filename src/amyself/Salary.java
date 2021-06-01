package amyself;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Salary {
    private static Scanner sc;
    public static void main (String[] args ) {

        double tax = 0.28;
        sc = new Scanner(System.in);
        System.out.println("Please write down your salary:");
        double Salary = sc.nextDouble();
        double taxes = Salary * tax;
        double SalaryAfterTax = Salary-taxes;

        DecimalFormat df = new DecimalFormat("#.##");

        if ( Salary == 0  )
        {
            System.out.println("Go to work laisy human!!");

        }
        else { System.out.println("Your taxes are:  " + df.format(taxes) +
                ".\n" + "Your salary after taxes is:  "
        + df.format(SalaryAfterTax) );

        } {

        }



    }
}
