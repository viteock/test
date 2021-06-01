package amyself;

public class quizz {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta = ta + tb;
        ta.replace('C', 'D');
        System.out.println(ta);


        String aa = "   aaaa    ";
        int a = aa.trim().length();
        System.out.println("a = " + a);

        String az = "gfgfgfgfg";
        az = az.replace('g', 'f');
        System.out.println(az.replace('g', 'a'));
    }

}
