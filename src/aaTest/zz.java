package aaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class zz {
    public static void main(String[] args) throws Exception {
        int[] aq = new int[2];
        char[] a = "aloha".toCharArray();
        int[] ad = {1,2,3};

        String[] asd = "1as.2.3.4.5".split("a");
        System.out.println(Arrays.toString(asd));

        System.out.println("java".replace('a', ' '));
        String str = "jajaja";
        str= str.replace('j',' ').replace('a',' ');
        System.out.println(str.trim().isEmpty());


        System.out.println("------------");

        System.out.println(
        );

        c();
        String technologies = "java, html, css, selenium, testng, maven cucumber";
        System.out.println(preIndex(technologies, ","));
    }

    public void check(){
String a = "12asdas";
for(int i = 0 ; i<a.length();i++){
    if(Character.isDigit(a.charAt(i))){
    }
}
    }

    public static void c()  {

        int[] bz = {1,6,2,3,4};
        List av= Arrays.stream(bz).boxed().collect(Collectors.toList());

        System.out.println(av.get(1));

        String[] ad = {"q","we","a"};
        List<String> ads= new ArrayList(Arrays.asList(ad));
        System.out.println(ads.toString());

    }



    public static int preIndex(String arg0, String target){

        return arg0.substring(0,arg0.lastIndexOf(target)).lastIndexOf(target);
    }
}
