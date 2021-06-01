package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
        //add/increase count by 2
        count = count + 2;
        System.out.println("count = " + count);
        System.out.println();

        int apples = 2;
        System.out.println("apples = " + apples);
        apples = apples +10;
        System.out.println();
        System.out.println("apples = " + apples);
        apples = apples - 3;
        System.out.println("apples = " + apples);
        System.out.println();

        //dividing
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        System.out.println();

        int players = 10;
        System.out.println("players = " + players);
        //double the players to start the match
        players = players * 2;
        System.out.println("players = " + players);
        System.out.println();

        int cents = 9568;
        System.out.println("cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println(" remaining cents = " + cents);
    }
}
