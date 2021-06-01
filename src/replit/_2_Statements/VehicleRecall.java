package replit._2_Statements;

public class VehicleRecall {
    public static void main(String[] args) {
        int vehicleYear = 1996;

        //copy from
        if (vehicleYear >= 1995 && vehicleYear <= 1998) {
            System.out.print("Your vehicle needs to be recalled!");
        } else if (vehicleYear >= 2001 && vehicleYear <= 2002) {
            System.out.print("Your vehicle needs to be recalled!");
        } else if (vehicleYear >= 2004 && vehicleYear <= 2006) {
            System.out.print("Your vehicle needs to be recalled!");
        } else if (vehicleYear >= 2015 && vehicleYear <= 2017) {
            System.out.print("Your vehicle needs to be recalled!");
        } else {
            System.out.print("Your vehicle is fine, enjoy!");
        }
    }
}
