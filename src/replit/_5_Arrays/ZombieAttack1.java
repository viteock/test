package replit._5_Arrays;

import java.util.Arrays;

public class ZombieAttack1 {
    public static void main(String[] args) {
        int[] inhabitants = {10, 5, 0, 0, 4, 7, 6, 2};

        //copy from
        int totalPeople;
        int day = 0;
        do {
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            totalPeople = 0;
            for (int i = 0; i < inhabitants.length; i++) {
                totalPeople += inhabitants[i];
                inhabitants[i] /= 2;
            }
            day++;
        } while (totalPeople > 0);
        System.out.println("---- EXTINCT ----");
    }
}
