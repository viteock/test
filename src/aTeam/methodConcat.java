package aTeam;

import java.util.Arrays;

public class methodConcat {
    public static int[] concatArrays(int[] par1, int[] par2) {
        int[] result = new int[par1.length + par2.length];

        int maxLength = (par1.length > par2.length) ? par1.length : par2.length;

        for (int i = 0, k = 0; i < maxLength; i++) {
            if (i < par1.length) {
                result[k++] = par1[i];
            }
            if (i < par2.length) {
                result[k++] = par2[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatArrays(new int[]{45, 689, 112, 5446, 43634}, new int[]{23, 64})));
    }
}
