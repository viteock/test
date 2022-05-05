package aHomework;

public class fronTimes {
    public static String frontTimesMethod(String str, int n) {
        String newStr = "";
        if (str.length() > 3) {
            for (int i = 1; i < n; i++) {
                newStr += str.substring(0,3);
            }
        } else {
            for (int i = 1; i < n; i++) {
                newStr += str;
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(frontTimesMethod("Choco", 4));
    }
}