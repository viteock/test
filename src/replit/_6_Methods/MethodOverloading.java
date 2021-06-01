package replit._6_Methods;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodOverloading {

    public static int maxN(int[] intNums) {
        int maxNumber = 0;
        for (int eachNumber : intNums) {
            if (eachNumber > maxNumber) {
                maxNumber = eachNumber;
            }
        }
        return maxNumber;
    }

    public static double maxN(double[] intNums) {
        double maxNumber = 0;
        for (double eachNumber : intNums) {
            if (eachNumber > maxNumber) {
                maxNumber = eachNumber;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(maxN(new int[]{12, 1, 45, 23, 41, 56, 3, 3, 5, 6}));
        System.out.println();
        System.out.println(maxN(new double[]{12.4, 34.4, 43.1, 43}));
        System.out.println();
        System.out.println(maxNumber(new int[]{12, 1, 45, 23, 41, 56, 3, 3, 5, 6}));
        //maxNumber(new int[]{12, 1, 45, 23, 41, 56, 3, 3, 5, 6});
    }

    public static int maxNumber(int[] intNums) {
        Arrays.sort(intNums);
        int maxNum = intNums[intNums.length - 1];
        return maxNum;
    }

    public static double maxNumber(double[] intNums) {
        Arrays.sort(intNums);
        double maxNum = intNums[intNums.length - 1];
        return maxNum;
    }
}
