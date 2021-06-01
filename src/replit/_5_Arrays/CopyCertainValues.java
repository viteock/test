package replit._5_Arrays;

import java.util.*;

public class CopyCertainValues {
    public static void main(String[] args) {
        String[] arr = {"zero", "one", "two", "three", "four"};

        //copy from

        int count = 0;
        for (String each : arr) {
            if (each.contains("e")) {
                count++;
            }
        }
        String[] fewValues = new String[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")) {
                fewValues[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(fewValues));
    }
}
