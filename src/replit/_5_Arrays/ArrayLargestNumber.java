package replit._5_Arrays;

public class ArrayLargestNumber {
    public static void main(String[] args) {
        int rows = 2, cols = 4;
        int[][] arr = {{1, 2, 3, 5}, {8, 1, 5, 6}};

        //copy from
        int largestNum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > largestNum) {
                    largestNum = arr[i][j];
                }
            }
        }
        System.out.print(largestNum);
    }
}
