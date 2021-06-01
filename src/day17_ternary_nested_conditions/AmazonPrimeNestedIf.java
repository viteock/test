package day17_ternary_nested_conditions;

public class AmazonPrimeNestedIf {
    public static void main(String[] args) {
        int itemPrice = 30;
        boolean isPrimeMember = false;

        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if (itemPrice > 25) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. fee is $10");
            }
//              ternary version
//                String print = (itemPrice > 25) ? "Eligible for free regular shipping" :
//                        "Not eligible for free shipping. fee is $10";
//                System.out.println(print);


        }
    }
}
