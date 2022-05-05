package aHomework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class moveZeros {
    //aray iz 16

    public static int[] moveZero (int[] arg){
        List<Integer> list = new ArrayList<>();
        for(int i =0; i < arg.length; i++){
            if(arg[i] !=0){
                list.add(arg[i]);
            }
        }
        int[] result = new int[arg.length];
        for(int i = 0; i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZero(new int[]{0, 1, 0, 0, 2, 0, 3})));
        System.out.println(Arrays.toString(moveZero1(new int[]{0, 1, 0, 0, 2, 0, 3})));
        String[] a =( "aloha".split(""));
        System.out.println("a = " + Arrays.toString(a));
         Arrays.sort(a);
        System.out.println("a = " + Arrays.toString(a));
       // System.out.println("String.join(\"\",a) = " + String.join("", a));
        String[] az = ("aahlo".split(""));
        Arrays.sort(az);
        System.out.println(Arrays.equals(a,az));

    }
    public static int[] moveZero1(int[] arg){
        int[] result = new int[arg.length]; // i => arg; j => result
        for(int i =0 , j=0 ; i < arg.length; i++){
            if(arg[i] !=0){
                result[j] = arg[i];
                j++;
            }
        }
        return result;
    }
}
