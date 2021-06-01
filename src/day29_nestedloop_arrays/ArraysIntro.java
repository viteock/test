package day29_nestedloop_arrays;
import java.util.*;
public class ArraysIntro {
    public static void main(String[] args) throws InterruptedException {
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        //print vales of array
        System.out.println("value at index 0 : " + nums[0]);
        System.out.println("value at inde 1 : " + nums[1]);

        //how to find out the size of array.
        System.out.println("number of elements = " + nums.length);

        //store length of array into len variable
        int len = nums.length;

    }
}
