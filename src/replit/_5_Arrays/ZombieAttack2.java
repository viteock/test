package replit._5_Arrays;

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};

        //copy from
        int totalPeople;
        int day = 0;
        do {
            int[] tempInhabitants = new int[inhabitants.length];
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            totalPeople = 0;
            for (int i = 0; i < inhabitants.length; i++) {
                totalPeople += inhabitants[i];
                if (i > 0 && inhabitants[i - 1] == 0) {
                    tempInhabitants[i] = inhabitants[i] / 2;
                } else if (i < inhabitants.length - 1 && inhabitants[i + 1] == 0) {
                    tempInhabitants[i] = inhabitants[i] / 2;
                } else {
                    tempInhabitants[i] = inhabitants[i];
                }
            }
            inhabitants = tempInhabitants;
            day++;
        } while (totalPeople > 0);
        System.out.println("---- EXTINCT ----");
    }
}
