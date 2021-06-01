package replit._5_Arrays;

public class Has55 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 4, 3, 2, 1, 5};

        //copy from
        boolean result = false;
        for (int i = 0; i < nums.length - 1; i++) {
            result = nums[i] == nums[i + 1] && nums[i] == 5;
            if (result) {
                break;
            }
        }
        System.out.print(result);
    }
}
