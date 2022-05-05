package aaTest;

import java.util.*;

public class Gg {
    public static void main(String[] args) {
        String abc = "abx";
        List<String> aL = Arrays.asList(abc.split(""));
        System.out.println(aL);
        Character character = aL.get(1).charAt(0);

        Iterator<String> dd = aL.iterator();

        char[] a = abc.toCharArray();

        Map<Integer,Object> ds = new LinkedHashMap<>();
        List<Integer> abcs = new LinkedList<>();

        System.out.println(1%10);


        abc.contains(abc.charAt(1)+"");
    }
}
