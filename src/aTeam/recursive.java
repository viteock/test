package aTeam;

public class recursive {

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("invalid entry");
            return 0;
        }
        if (num1 < num2) {   //   num1 = 2   num2 = 5   2/5 = 0  2 % 5 = 2
            System.out.println("remainder is :" + num1);
            return 0;
        }
        int a = num1 - num2;
        return 1 + divide(a, num2);
    }

    public static void main(String[] args) {
        System.out.println(divide(23, 4));
    }
}
