package amyself;

import java.sql.SQLOutput;

public class CarsHomework {
    public static void main(String[] args) {
        String samCar = "Toyota";
        String johnCar = samCar;
        String bobCar = johnCar;
        String mikeCAr = bobCar;
        String karenCar = bobCar;
        String stanCar = karenCar;
        String danyCar = stanCar;
        String sandraCar = samCar;
        stanCar = sandraCar = "Tesla";
        karenCar = "BMW";

        System.out.println("What kind of car each one has:"+
                "\nSam:\t" + samCar +
                "\nJohn:\t" + johnCar +
                "\nBob:\t" + bobCar +
                "\nMike:\t" + mikeCAr +
                "\nKaren:\t" + karenCar +
                "\nStan:\t" + stanCar +
                "\nDany:\t" + danyCar +
                "\nSandra:\t" + sandraCar);
        System.out.println("bobCar = " + bobCar); // variableName.soutv

    }
}
