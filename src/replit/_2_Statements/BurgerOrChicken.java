package replit._2_Statements;

public class BurgerOrChicken {
    public static void main(String[] args) {
        String in = "soda";
        double price = (in.equals("burger") || in.equals("chicken")) ? 10.0 : ((in.equals("fries")) ? 3.5 : 2.0);
        System.out.print(price);

    }
}
