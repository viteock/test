package replit._5_Arrays;

public class Printing03 {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "6"};

        //copy from
        for (int i = 0; i < arr.length - 2; i++) {
            System.out.println(arr[i] + ", " + arr[i + 1] + ", " + arr[i + 2]);
        }
    }
}
