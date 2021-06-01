package replit._5_Arrays;

public class ArrayFindMax {
    public static void main(String[] args) {
        int[] nums = {34, 543, 2345, 4325, 563, 1321};

        //copy from
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
        System.out.print(maxNum);
    }
}
