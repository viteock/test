package day14_multi_branch_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your language:");
        System.out.println("1 for english");
        System.out.println("2 for spanish");
        System.out.println("3 for turkish");
        System.out.println("4 for russian");
        System.out.println("5 for french");
        System.out.println("Please enter your language: ");

        int selection = sc.nextInt();

        if (selection == 1) {
            System.out.println("hello, thank for your call");
        } else if (selection == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (selection == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (selection == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        } else if (selection == 5) {
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("lets talk java and english, hello");
        }
    }
}
