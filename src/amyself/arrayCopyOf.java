package amyself;

import aHomework.abs;

import java.util.Arrays;

public class arrayCopyOf {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = Arrays.copyOf(a,6);
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("Arrays.toString(\"aloha\".toCharArray()) = " + Arrays.toString("aloha".toCharArray()));


    }
}
