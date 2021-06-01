package replit._6_Methods;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class ReverseLetters {

    public static String reverseNoSpec1(String str) {
        char[] strArr = str.toCharArray();
        String letter = "";
        for (char each : strArr) {
            if (Character.isLetter(each)) {
                letter += each + "";
            }
        }
        String reverseStr = "";
        for (int i = letter.length() - 1; i >= 0; i--) {
            reverseStr += letter.charAt(i);
        }
        String result = "";
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result += reverseStr.charAt(j);
                j++;
            } else {
                result += str.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverseNoSpec("Ab,c,de!$"));

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(0,6);
    }

    public static String reverseNoSpec(String str) {
        char[] chars = str.toCharArray();
        String onlyLetters = "";
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                onlyLetters += "" + chars[i];
            }
        }
        String result = "";
        for (int i = 0, j = onlyLetters.length() - 1; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                result += "" + onlyLetters.charAt(j);
                j--;
            } else {
                result += "" + chars[i];
            }
        }
        return result;
    }

}