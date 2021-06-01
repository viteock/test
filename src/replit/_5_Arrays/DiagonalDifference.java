package replit._5_Arrays;

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = 0;

        //copy from
        int leftRight = 0;
        int rightLeft = 0;
        for (int i = 0, j = matrix[i].length - 1; i < matrix.length && j >= 0; i++, j--) {
            leftRight += matrix[i][i];
            rightLeft += matrix[i][j];
        }
        result = leftRight - rightLeft;
    }
}

