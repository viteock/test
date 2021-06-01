package amyself;

import java.util.Scanner;

public class NextLineScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double bla = scan.nextDouble();
        scan.nextLine();
        String ala = scan.nextLine();
//        String aka = scan.nextLine();

        System.out.println("bla = " + bla);
        System.out.println("ala = " + ala);
//        System.out.println("aka = " + aka);

    }
}
