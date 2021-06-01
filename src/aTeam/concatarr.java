package aTeam;

import java.util.Arrays;

public class concatarr {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 3};
        int[] arr2 = {0, 1};

        //int[] result = new int[5]; // 0 0 0 0 0
       // result[0] = 5;
         //result[1] =2;

        int[] result = new int[arr1.length + arr2.length];

        int k = 0;

        for ( int each : arr1 ) {
                    //0 5
                    //1 2
                    //2 3
            result[k++] = each;
            //k++;
        }

        for ( int each : arr2 ) {
                    //3 0
                    //4 1
            result[k++] = each;
        }

        System.out.println("result = " + Arrays.toString(result));
    }
}
