package replit._2_Statements;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {

        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        //copy from
        //property type
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        switch (houseType) {
            case ("Condo"):
                propertyPrice = 50_000;
                break;
            case ("Townhouse"):
                propertyPrice = 75_000;
                break;
            case ("Single Family Home"):
                propertyPrice = 95_000;
                break;
        }
        //bedrooms
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += (numberOfBedrooms * 30_000);
        //backyard
        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if (houseType.equals("Condo")) {
            System.out.println("Backyard is not available for condo!");
        } else {
            propertyPrice = (backyard) ? (propertyPrice += 5000) : propertyPrice;
        }
        //garage
        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if (garage) {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots > 10) {
                System.out.println("Pardon, it's not a public parking!");
            } else {
                propertyPrice += (garageSpots * 20_000);
            }
        }
        //metro accessibility
        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if (metroAccessibility <= 1) {
            propertyPrice += 10_000;
        } else if (metroAccessibility > 1 && metroAccessibility < 3) {
            propertyPrice += 5_000;
        }
        //highway accessibility
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility <= 1) {
            propertyPrice += 15_000;
        } else if (highwayAccessibility > 1 && highwayAccessibility < 5) {
            propertyPrice += 8_000;
        } else if (highwayAccessibility >= 5 && highwayAccessibility <= 20) {
            propertyPrice += 4_000;
        }
        //school rating
        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if (schoolScore <= 10 && schoolScore >= 8) {
            propertyPrice += 45_000;
        } else if (schoolScore < 8 && schoolScore >= 4) {
            propertyPrice += 20_000;
        } else {
            propertyPrice += 5_000;
        }
        //smoking
        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        propertyPrice = (smoking) ? propertyPrice -= 5_000 : propertyPrice;
        //display message
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");
    }
}