package aHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chessboard {

    public static boolean rooksSafeV1(String[][] arg0) {
        for (int row = 0, column = 0; row < 8 && column < 8; row++, column++) {
            int count = 0;
            for (int i = 0; i < 8; i++) {
                if (arg0[row][i].equals("rook")) {
                    count++;
                }
                if (count > 1) {
                    return false;
                }
            }
            count = 0;
            for (int i = 0; i < 8; i++) {
                if (arg0[i][column].equals("rook")) {
                    count++;
                }
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean rooksSafeV1(int[][] arg0) {
        for (int row = 0, column = 0; row < 8 && column < 8; row++, column++) {
            int count = 0;
            for (int i = 0; i < 8; i++) {
                if (arg0[row][i] == 1) {
                    count++;
                }
                if (count > 1) {
                    return false;
                }
            }
            count = 0;
            for (int i = 0; i < 8; i++) {
                if (arg0[i][column] == 1) {
                    count++;
                }
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean rooksSafeV2(String[][] parameter) {
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (parameter[row][column].equals("rook")) {
                    for (int i = 0; i < 8; i++) {
                        if (i != column && parameter[row][i].equals("rook")) {
                            return false;
                        }
                        if (i != row && parameter[i][column].equals("rook")) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean rooksSafeV2(int[][] parameter) {
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (parameter[row][column] == 1) {
                    for (int i = 0; i < 8; i++) {
                        if (i != column && parameter[row][i] == 1) {
                            return false;
                        }
                        if (i != row && parameter[i][column] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static int negNum(int[][] parameter) {
        int count = 0;
        int length = parameter.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < parameter[i].length; j++) {
                if (parameter[i][j] < 0) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] a = {
                {-4, -4, -1, -1,},
                {-2, -2, -1, -1},
                {-1, 1, 2, 3},
                {1, 2, 3, 4}
        };
        System.out.println(negNum(a));


        String[][] chess2D = {
                {"empty", "empty", "empty", "empty", "empty", "rook", "empty", "empty",},
                {"empty", "rook", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "rook", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",},
        };
        String[][] chess2DFalse = {
                {"empty", "empty", "empty", "empty", "empty", "rook", "empty", "empty",},
                {"empty", "rook", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "rook", "empty", "empty", "empty", "empty",},
                {"empty", "rook", "empty", "empty", "empty", "empty", "empty", "empty",},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",},
        };
        System.out.println("v1 should be true = >" + rooksSafeV1(chess2D));
        System.out.println("v2 should be true = >" + rooksSafeV2(chess2D));

        System.out.println("v1 should be false=> " + rooksSafeV1(chess2DFalse));
        System.out.println("v2 should be false=> " + rooksSafeV2(chess2DFalse));

        int[][] chessInt = {
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
        };

        int[][] chessIntFalse = {
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
        };


        System.out.println("v1Int should be true = > " + rooksSafeV1(chessInt));
        System.out.println("v2Int should be true = > " + rooksSafeV2(chessInt));

        System.out.println("v1Int should be false = > " + rooksSafeV1(chessIntFalse));
        System.out.println("v2Int should be false = > " + rooksSafeV2(chessIntFalse));

//        List<Integer> numbers = Arrays.asList( 12,23,11,25,1,2,3);
//        Collections.sort(numbers);
//        System.out.println(numbers.get(numbers.size()-2));

        int[] number1 = {2,3,4,1};
        System.out.println("result question 1 <should be 23> = > " + question1(number1));

        System.out.println("result question 2 true=> " + question2("2341", "2333"));
        System.out.println("result question 2 false=> " + question2("123", "1231"));

        question5(number1);
    }


    public static int question1(int[] arg0) {
        Arrays.sort(arg0);
        return arg0[arg0.length - 2];
    }

    public static boolean question2(String arg1, String arg2) {
        return Integer.parseInt(arg1) > Integer.parseInt(arg2);
    }

    public static void question5(int[] arg0) {
        List<String> allCombinations = new ArrayList<>();
        for (int i = 0; i < arg0.length; i++) {
            String toAdd = "" + arg0[i];
            int result = arg0[i];
            for (int j = 0; j < arg0.length; j++) {
                if (j != i) {
                    result += arg0[j];
                    if (result <= 10 && j< arg0.length) {
                        toAdd += " + " + arg0[j];
                    } else if (!toAdd.equals("" + arg0[i]) && result > 10) {
                        result -= arg0[j];
                        toAdd += " = " + result;
                        if (!allCombinations.contains(toAdd)) {
                            allCombinations.add(toAdd);

                        }

                    }
                }
            }
        }
        for(String each : allCombinations){
            System.out.println(each.toString());
        }

}}
