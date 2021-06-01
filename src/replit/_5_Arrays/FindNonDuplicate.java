package replit._5_Arrays;

public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 55, 3, 4, 3, 4};

        //copy from
        int count;
        for (int j = 0; j < nums.length; j++) {
            count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] == nums[i]) {
                    count++;
                    if (count < 1) {
                        break;
                    }
                }
            }
            if (count == 1) {
                System.out.println(nums[j]);
                break;
            }
        }

    }
}
