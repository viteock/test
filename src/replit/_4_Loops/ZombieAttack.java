package replit._4_Loops;

public class ZombieAttack {
    public static void main(String[] args) {
        int inhabitants = 100;

        //copy from
        int day = 0;
        while (inhabitants != 0) {
            System.out.println("Day " + day + " [" + inhabitants + "]");
            inhabitants /= 2;
            day++;
        }
        System.out.print("---- EXTINCT ----");
    }
}
