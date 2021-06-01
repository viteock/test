package replit._5_Arrays;

public class ArrayCountEvens {
    public static void main(String[] args) {
        int[] nums = {4, 56, 674, 432, 1221, 345, 434, 345};

        //copy from
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                continue;
            }
            count++;
        }
        System.out.print(count);
    }
}
