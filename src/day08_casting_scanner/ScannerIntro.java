package day08_casting_scanner;
import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = scan.next();
        System.out.println(name);

    }
}
