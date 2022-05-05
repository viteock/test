package amyself;

import java.util.ArrayList;
import java.util.Arrays;

public class zz {
    public static void main(String[] args) {

        String[] dictionary = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};

        String input = "ilikesamsung";

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String temp = input.substring(i, j+1);
                if(Arrays.asList(dictionary).contains(temp) ){
                    if(!words.contains(temp)) {
                        words.add(temp);
                    }
                }
            }
        }
        System.out.println(words.toString());
        int z = 0;
        for(String each : words){
            z+=each.length();
        }
        String result = (z == input.length()) ? "YES" : "NO";
        System.out.println("result = " + result);
    }
}
