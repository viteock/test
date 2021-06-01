package replit._5_Arrays;

import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5};

        //copy from
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
          newNums[i] = (i == nums.length - 1) ? nums[0] : nums[i + 1];
        }
        System.out.println(Arrays.toString(newNums));

    }
}
