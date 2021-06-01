package amyself;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a  = sc.next();
        System.out.println(removeDup(a));
    }

    public static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);


        return result;
    }
}