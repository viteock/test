package amyself;

public class meee {
    public static int recursive(int num1, int num2) {
        if(num2 == 0) {
            System.out.println("invalid entry");
            return 0;
        }
        if (num1 < num2) {
            System.out.println("remainder is : " + num1);
            return 0;
        }
        int a = num1 - num2;
        return 1 + recursive(a, num2);
    }

    public static void main(String[] args) {
        System.out.println(recursive(31, 5));
    }
}
