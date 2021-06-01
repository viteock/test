package replit._5_Arrays;

import java.util.Arrays;

public class MakeLast {
    public static void main(String[] args) {
        int size = 4;
        int[] nums = new int[size];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        //copy from
        int[] newNums = new int[size * 2];
        for (int j = 0; j < size * 2; j++) {
            if (j != size * 2 - 1) {
                newNums[j] = 0;
            } else {
                newNums[j] = nums[nums.length - 1];
            }
        }
        System.out.print(Arrays.toString(newNums));

        System.out.println();
        int[] num = {2, 4, 5};
        int [] newNum;
        if(size< 2){
            newNum=new int[]{num[0]};
        }else{
            newNum = new int[]{num[0], num[1]};
        }
        System.out.println(Arrays.toString(newNum));

        newNum = (size < 2) ? new int[]{num[0]} : new int[]{num[0], num[1]};
        System.out.println(Arrays.toString(newNum));


    }
}
