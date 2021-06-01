package replit._6_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCover {
    public static void main(String[] args) {
        System.out.println(coverString("apples", "p"));
        System.out.println(reverse("aloha"));
    }
    public static String coverString(String main, String coverME) {
        // your code here

        String result ="";
        if(!(main.contains(coverME))){
            return "[" + main + "]";
        } else {
            result = "[" + coverME + "]";
            main = main.replace(coverME , result);
            return main;
        }

    }
    public static String reverse(String input) {
        List<Character> chars = new ArrayList(Arrays.asList(input.split("")));
        for (int i = 0; i < chars.size() / 2; i++) {
            Collections.swap(chars, i , chars.size() - 1 - i);
        }
        return chars.toString().substring(1,chars.size() - 1).replace(", ", "");
    }
    }