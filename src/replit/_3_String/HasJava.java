package replit._3_String;

public class HasJava {
    public static void main(String[] args) {
        boolean exists = false;
        String word = "javac++";

        //copy from
        exists = word.substring(0).startsWith("java") || word.substring(1).startsWith("java");
        System.out.print(exists);
    }
}
