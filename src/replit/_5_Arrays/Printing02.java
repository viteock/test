package replit._5_Arrays;

public class Printing02 {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "4", "5", "6", "7", "8"};

        //copy from
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i] + " , " + arr[i + 1]);
        }
    }
}
