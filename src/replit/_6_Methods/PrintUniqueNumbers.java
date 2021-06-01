package replit._6_Methods;

public class PrintUniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {10, 5, 5, 6, 6, 10, 10, 2, 3, 4};

        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        for(int each : nums) {
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(each == nums[i]) {
                    count ++;
                    if(count > 1){
                        break;
                    }
                }
            }
            if(count == 1){
                System.out.println(each);
            }
        }
    }

}