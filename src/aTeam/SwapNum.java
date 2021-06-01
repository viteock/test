package aTeam;

public class SwapNum {
    public static void main(String[] args) {

        int numA = 1;
        int numB = 2;

        int temporary = numB;
        numB = numA;
        numA = temporary;

        System.out.println(numA + " " +numB);

        numA = numA + numB;
        numB = numA - numB;
        numA = numA - numB;

        System.out.println( numA + " " + numB);

    }
}
