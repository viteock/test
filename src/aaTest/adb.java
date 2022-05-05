package aaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class adb {
    public int  solution(int[] A){
        if(A.length < 2){
            throw new RuntimeException("N cant");
        }
        int i = Integer.MAX_VALUE;
        return 1;
    }

    public static void main(String[] args) {
   //     solution(new int[1]);

        int[] ab = {1,2,3,4,512,-1};
        Arrays.sort(ab);
        System.out.println(Arrays.toString(ab));
        List<Integer> a = new ArrayList<>(Arrays.asList(2,12,1,3,4,5));
        Collections.sort(a);
        System.out.println();
        a.removeIf(n -> n > 3);
        System.out.println(a);

    }
}
