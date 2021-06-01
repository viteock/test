package replit._6_Methods;
import java.util.*;
public class PopulateArray {
    public static int[] populate(int[] r) {
        int[] population = new int [r.length];
        for(int i = 0, j = 1; i < r.length; i++, j++ ) {
            population[i] = j;
        }
        return population;
    }

    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
