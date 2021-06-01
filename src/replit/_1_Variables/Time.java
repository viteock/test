package replit._1_Variables;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);

        int hour, minute, second;
        String amOrPm;
        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm );
    }
}
