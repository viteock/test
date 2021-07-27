package replit._8_OOP.creditCard;

public class Chase extends CreditCard{
    public Chase(long cardNumber, double balance) {
        super(cardNumber, balance);
        apr = 10.99;
        cashback = true;
        bank = "Chase";
    }
    public void useCard(){
        super.useCard(bank);
    }
    public void payBalance(double givenBalance) {
        super.payBalance(givenBalance);
    }
    public String toString(){
        return super.toString();
    }
}