package amyself;

public class Donuts {
    public static void main(String[] args) {
        double money = 25.45;
        int donuts = 11;
        double donutsPrice = 1.75;
        int friends = 3;
        double friendsMoney = 10.30;
        //calculating
        double moneySpent = donutsPrice * donuts;
        double moneyLeft = money - moneySpent + friendsMoney;
        int donutsEachFriend = donuts / friends;
        int donutsForMe = donuts % donutsEachFriend;
        //Printing
        System.out.println("I spent:\t$" + moneySpent + "\nI have:\t$" + moneyLeft +
                "\nEach friend ate:\t" + donutsEachFriend + " donuts \nDonuts left for me:\t" +
                donutsForMe);
    }
}
