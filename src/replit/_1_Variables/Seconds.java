package replit._1_Variables;
import java.util.Scanner;
public class Seconds {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        int inputSeconds, hours, minutes, seconds;
        Scanner time = new Scanner(System.in);
        //Enter seconds
        System.out.println("Enter seconds:");
        inputSeconds = time.nextInt();
        //calculating

        hours = inputSeconds / 3600;
        minutes = hours % 60;
        seconds = inputSeconds % 60;

        System.out.print(hours + " hours, " + minutes + " minutes, and " +
                seconds + " seconds");
    }
}