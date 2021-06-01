package replit._4_Loops;

public class PrintNTimes {
    public static void main(String[] args) {
        int n = 3;

        //copy from
        String str = "";
        while (n > 0) {
            str += "*";
            n--;
        }
        System.out.print(str);
    }
}
