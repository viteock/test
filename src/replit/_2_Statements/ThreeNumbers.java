package replit._2_Statements;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        //your code here
        //copy from
        String print;
        if ((n1 < n2) && (n1 < n3)) {
            print = (n2 < n3) ? ("n3 is bigger") : ("n2 is bigger");
        } else if((n2 < n1) && (n2 < n3)) {
            print = (n1 < n3) ? ("n3 is bigger") : ("n1 is bigger");
        }else {
            print = (n1 < n2) ? ("n2 is bigger") : ("n1 is bigger");
        }
        System.out.print(print);
    }
}
