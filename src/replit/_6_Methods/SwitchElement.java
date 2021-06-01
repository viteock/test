package replit._6_Methods;

import java.util.Arrays;

public class SwitchElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
       Arrays.toString(do_switch(arr));
        //System.out.println(Arrays.toString(do_switch(arr)));
        System.out.println(Arrays.toString(arr));
    }
    public static int[] do_switch(int[] i) {
        int temp = i[0];
        i[0] = i[i.length - 1];
        i[i.length - 1] = temp;
        return i;
    }

}
