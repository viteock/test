package amyself;

import java.util.Arrays;
import java.util.TreeSet;

public class Solution2Task {
    public static void main(String[] args) {
        String a = "javaa";
        String b = "jvaa";
        System.out.println(Same(a,b));

        System.out.println();
        System.out.println(same(a,b));
    }

    public static boolean Same(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();

        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        return str1.equals(str2);
    }
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1="", a2="";

        for(char each: ch1)

            a1 +=each;



        for(char each: ch2)

            a2 +=each;



        return  a1.equals(a2) ;

    }
}