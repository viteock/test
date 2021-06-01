package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        byte numberOfBedrooms = 15;
        double startingPrice = 0.0;

        System.out.println("####  Welcome to Adaire Apartments  ####");

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.55;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.25;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899.21;
                break;
            default:
                System.out.println(numberOfBedrooms + " currently unavailable");
                return; //exit main method
        }
        System.out.println("Starting price : " + startingPrice);
    }
}
