package replit._5_Arrays;

public class Printing01 {
    public static void main(String[] args) {
        String[] arr = {"asfsaf", "fasfasfg", "safasfas", "fdsfsdf", "asfasf"};

        //copy from
        for (String each : arr) {
            if (each.length() >= 3) {
                System.out.println(each.substring(0, 3));
            }
        }
    }
}
