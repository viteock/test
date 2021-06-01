package aTeam;

public class SumOfDigits {

    public static int sumFromString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        name("I am alcoholic");
        System.out.println(sumFromString("12as23sss45"));

    }

      public static void name(String a) {
          System.out.println("aloha");
          a = a.substring(1,4);
          System.out.println(a);
    }
}
