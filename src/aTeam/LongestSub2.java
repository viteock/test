package aTeam;

public class LongestSub2 {
    public static void main(String[] args) {
        String str = "aabbcddeeee";
        String longestOne = "";
        for (int i = 0; i < str.length() - 1; i++) {
            String temp = "" + str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    temp += "" + str.charAt(j); //aa
                } else {
                    break;
                }
            }
            if (longestOne.length() < temp.length()) {
                longestOne = temp; //bbb
            }

        }
        System.out.println(longestOne);

        System.out.println("__________________");
        LongestSub.substringMethod("aeeevvvvnnnnn");
    }
}
