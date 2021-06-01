package aTeam;

import java.util.Arrays;

public class MaxArray {
    /*
    Find the maximum number in the array
     */
    public static void main(String[] args) {
        int[] arr = {12, 21, 333, 55, 66, 45, 333};
        Arrays.sort(arr);
        int maxNum = arr[arr.length -1];
        System.out.println(maxNum);
    }
}
