package amyself;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListCheck {
    public static void main(String[] args) {
        List<Object> a = new ArrayList<>();
        a.add("aloha");
        a.add(123);
        System.out.println("a = " + a);
        List<Integer> b = new ArrayList<>();
        System.out.println("b = " + b);
        int[] c = new int[5];
        System.out.println("c = " + Arrays.toString(c));
    }
}
