package aTeam;

public class MethodUnique {

    public static String uniqueMethod(String str) {
        String unique = "";

        for(int i = 0; i < str.length(); i++) {
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                unique += "" + str.charAt(i);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(uniqueMethod("QQwwertyyyy"));
    }
}
