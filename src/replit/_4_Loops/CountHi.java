package replit._4_Loops;

public class CountHi {
    public static void main(String[] args) {
        String str = "hi dfdfdhifdfdihidfdfdfhi";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String eachTwo = str.substring(i, i + 2);
            if (eachTwo.equals("hi")) {
                count++;
            }
        }
        System.out.print(count);
    }
}
