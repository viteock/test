package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45,
                speedLimit = 55;
        boolean isSpeeding;

        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit > currentSpeed);

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are u speeding? - " + isSpeeding);

        double accountBalance = 315.46;
        double itemPrice = 121.43;
        System.out.println(accountBalance < itemPrice);
        System.out.println(itemPrice > accountBalance);

        boolean canAfford = itemPrice <= accountBalance;

        System.out.println("canAfford = " + canAfford);

        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);
    }
}
