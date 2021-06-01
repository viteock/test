package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {23, 323, 545, 3, 543534, 43, 33, 32, 52, 234, 8};
        int i = 0;
        for (int eachNum : data) {

            System.out.println("data[" + i + "] = " + eachNum);
            i++;
        }
        System.out.println(data[data.length - 1]);

        //print all numbers backwards in same line
        for(int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(data[idx] + " ");
        }
    }
}
