package replit._6_Methods;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("NurSeas RuN"));
    }

    public static boolean isPalindrome(String check) {
        check = check.replace(" ", "").toLowerCase();
        for (int i = 0; i < check.length() / 2; i++) {
            if (check.charAt(i) != check.charAt(check.length() - 1 - i)) {
                return false;
            }
        }
      return true;
    }
}
