package replit._5_Arrays;

import java.util.Arrays;

public class InnerAndOuter {
    public static void main(String[] args) {
        int[] outer = {1, 2, 5, 4};
        int[] inner = {2, 3};

        //copy from
        int count = 0;
        for (int eachInner : inner) {
            for (int eachOuter : outer) {
                if (eachInner == eachOuter) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count == inner.length);
    }
}
