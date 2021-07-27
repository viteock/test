package replit._7_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAll {
    public static void main(String[] args) {
        ArrayList<Boolean> an = new ArrayList<>(Arrays.asList(true,false,true));
        an.addAll(an);
        System.out.println(an);
    }
}
