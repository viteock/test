package replit._8_OOP.creditCard;

public class CreditCard{
    long cardNumber;
    double balance;
    double apr;
    boolean cashback;
    String bank;

    public CreditCard(long cardNumber, double balance){
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void useCard(String card){
        System.out.println("Using " + card + " card");
    }
    public void payBalance(double givenBalance) {
        System.out.println("Paying " + givenBalance + " from " + balance);
        balance -= givenBalance;
    }
    public String toString(){
        return bank + " credit card | card number: " + cardNumber +
                " | balance used: " + balance + " | APR: " + apr + " | has cashback: " +
                cashback;
    }
    public void useCard(){
    }
}
