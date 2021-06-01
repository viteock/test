package replit._4_Loops;

public class UtopianTree {
    public static void main(String[] args) {

        //copy from
        int year = 1;
        int growth = 0;
        int tresSize = 0;

        do {
            growth = 1;
            tresSize += growth;
            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + tresSize + "cm");
            year++;
        } while (year <= 3);
        do {
            growth = 2;
            tresSize += growth;
            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + tresSize + "cm");
            year++;
        } while (year > 3 && year <= 10);
    }
}
