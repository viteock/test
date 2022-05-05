package day19_class_vs_object_strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.TreeSet;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Aloha Hawaii";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("ibati capati".toUpperCase());

        System.out.println(Integer.numberOfLeadingZeros(01));

        String a = "aloha";

        String b = (new TreeSet<String>(Arrays.asList(a.split("")))).toString();
        System.out.println(b);

        String az = "alohaaahhhaaa";

        String ab = (new TreeSet<String>(Arrays.asList(az.split("")))).toString();
        System.out.println(b== ab);

        FINRA();

    }



    public static void FINRA() {

        String result = "";

        for(int i=1; i <= 30; i++) {

            if(i % 5==0 && i %3 ==0)

                result += "FINRA ";

            else if(i%5 == 0)

                result += "RA ";

            else if(i%3==0)

                result+="FIN ";

            else

                result += i+" ";

        }

        System.out.println(result);

    }
}
