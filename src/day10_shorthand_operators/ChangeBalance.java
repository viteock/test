package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1200.44;
        System.out.println("balance = " + balance);

        double baklava = 22.46;
        System.out.println("baklava = " + baklava);

        balance = balance -baklava;
        System.out.println("balance after buying baklava = " + balance);

        double napoleon = 44.46;
        System.out.println("napoleon = " + napoleon);

        balance = balance - napoleon;
        System.out.println("balance after napoleon = " + balance);

        //second napoleon is 50% off. lets buy it
        napoleon = napoleon /2;
        System.out.println("napoleon = " + napoleon);
        //buy it and decrease balance with napoleon price
        balance = balance -napoleon;
        System.out.println("balance after second napoleon = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance -plov;
        System.out.println("balance after plov = " + balance);

        double icedTea = 3.12;
        System.out.println("iceTea = " + icedTea);
        //buy 4 iced  teas and decrease balance
        balance = balance - icedTea * 4;
        System.out.println("balance after buying 4 iced teas = " + balance);
    }
}
