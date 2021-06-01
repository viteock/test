package replit._5_Arrays;

public class ArrayFindSum {
    public static void main(String[] args) {
        int[] nums = {23, 43, 55};

        //copy from
        int numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }
        System.out.print(numsSum);
    }
}
