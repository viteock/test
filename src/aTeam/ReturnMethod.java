package aTeam;


public class ReturnMethod {

    public static void main(String[] args) {
        System.out.println(ReturnString("Edward"));
    }

    public static String ReturnString(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed += str.charAt(str.length() - 1 - i);
        }
        return reversed;
    }
}
