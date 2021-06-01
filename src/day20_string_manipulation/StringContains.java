package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital One";
        System.out.println(company.contains(" O"));

        if(company.contains(" ")) {
            System.out.println("Multiple word company");
            System.out.println("java");

            if(company.toLowerCase().contains("ca")) {
                System.out.println("tada");
            }
        }
    }
}
