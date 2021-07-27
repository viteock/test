package replit._8_OOP.creditCard;

public class Discover extends CreditCard {
    public Discover(long cardNumber, double balance) {
        super(cardNumber, balance);
        apr = 11.99;
        cashback = true;
        bank = "Discover";
    }
    @Override
    public void useCard() {
        super.useCard(bank);
    }

    public void payBalance(double givenBalance) {
        super.payBalance(givenBalance);
    }
    public String toString(){
        return super.toString();
    }
}
