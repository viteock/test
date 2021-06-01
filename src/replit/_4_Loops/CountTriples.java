package replit._4_Loops;

public class CountTriples {
    public static void main(String[] args) {
        String str = "xxxcccdkfhdccc vvv";
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String eachThree = str.substring(i, i + 3);
            if (eachThree.charAt(0) == eachThree.charAt(1) && eachThree.charAt(1) == eachThree.charAt(2)) {
                count++;
            }
        }
        System.out.print(count);
String word = "asdas";
        for(int i = 0; i <= word.length() - 1; i++) {
            System.out.println(word.charAt(i));
        }
    }
}
