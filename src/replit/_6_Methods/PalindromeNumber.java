package replit._6_Methods;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 12345;
        isPalindrome(num);
    }
    public static void isPalindrome(int num) {

        //copy from
        int calcNum = num;
        int reverseNum = 0;
        while (calcNum !=0 ) {
            reverseNum = reverseNum *10 + (calcNum % 10);
            calcNum /= 10  ;
        }
        System.out.println(reverseNum == num);
    }
}
