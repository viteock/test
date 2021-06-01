package replit._5_Arrays;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        String[] words = { "asdasfas", "fasfasfsaf", "gfdgdfhj", "pgofhoju"};

        //copy from
        for (String each : words) {
            System.out.println("" + each.charAt(0) + each.charAt(each.length() - 1));
        }
    }

}
