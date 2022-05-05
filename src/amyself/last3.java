package amyself;

public class last3 {

    static String string;
    String arg1;

    public static String lastThree(String arg0) {
        String result = arg0.substring(arg0.length() - 3);
        string = "1";
        return result;
    }

    public static void main(String[] args) {
        last3 l = new last3();
        System.out.println("lastThree(\"Victor\") = " + l.lastThree("Victor"));
        last3 m = new last3();
        l.string = "aloha";
        l.arg1 = "1";
        System.out.println(m.string);
        m.string += "Hawaii";
        System.out.println(l.string);
        System.out.println(m.string);
        System.out.println(m.arg1);
    }

}
