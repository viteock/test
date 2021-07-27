package replit._8_OOP.creditCard;

public class CapitalOne extends CreditCard {
    public CapitalOne(long cardNumber, double balance) {
        super(cardNumber, balance);
        apr = 14.35;
        cashback = false;
        bank = "Capital One";
    }

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