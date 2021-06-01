package aTeam;


public class SameLetters {

    public static boolean sameLetters(String s1, String s2) {
        String copyOfS2 = s2;
        for(int i = 0; i < s1.length(); i++) {
            copyOfS2 = copyOfS2.replace("" +s1.charAt(i) , "");
        }                                    //'q'
        for(int i = 0; i < s2.length(); i ++){
            s1 = s1.replace("" + s2.charAt(i), "");
        }
        return copyOfS2.isEmpty() && s1.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(sameLetters1("aqwe","aaqqweeeeess"));//true
       System.out.println(sameLetters1("qweeee", "aaadfe"));//false
        System.out.println(sameLetters1("qwwwwwweeeeeeee", "qweww"));//true
        System.out.println(new int[]{1, 2, 3, 4});

    }
    public static boolean sameLetters1(String s1, String s2) {
        int i = 0;
        while(i < s1.length() && i < s2.length()) {
            s2 = s2.replace("" + s1.charAt(i), "");
            s1 = s1.replace("" + s1.charAt(i), "");
        }
        return s1.isEmpty() && s2.isEmpty();
    }
}
