package replit._8_OOP.creditCard;

public class Main {
    public static void main(String[] args) {
        Discover discover = new Discover(594849844, 9585);
        System.out.println(discover);

        CapitalOne capitalOne = new CapitalOne(84887112, 571);
        capitalOne.useCard();
        System.out.println(capitalOne);

        Chase chase = new Chase(5297481, 7115);
        chase.payBalance(500);
        System.out.println(chase);
    }
}
