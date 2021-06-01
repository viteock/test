package replit._3_String;

public class StringPrefixAgain {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 3;

        String str2 = str.substring(1);
        System.out.println(str2.contains(str.substring(0, n)));
    }
}
