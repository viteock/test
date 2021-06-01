package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 6;
        System.out.println("cars in parking lot = " + cars);

        // 4 cars left parking lot
        cars -= 4;
        System.out.println("cars in parking lot = " + cars);

        cars = cars -3;
        cars -= 3;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);
        
        String word = "Java";
        System.out.println("word = " + word);

        word = word + "programming";
        System.out.println("word = " + word);
        // add " is fun "
        word += " is fun!!!";
        System.out.println("word = " + word);

        String selenium = ",\n\t but \'selenium\' is more fun";
        word += selenium;
        System.out.println("word = " + word);

        word += 122345;
        System.out.println("word = " + word);

        char letter = 'B';
        System.out.println("letter = " + letter);
        letter += 2;
        System.out.println("letter = " + letter);
        //add 'J' to letter
        letter += 'J';
        System.out.println("letter = " + letter);
        letter -= 'H';
        System.out.println("letter = " + letter);

        double parkingFee = 12.40;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird fee is 50% off
        parkingFee /= 2;
        System.out.println("early bird parking fee = " + parkingFee);

        parkingFee -= parkingFee;
        System.out.println("weeken parking fee = " + parkingFee);

    }
}
