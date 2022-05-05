package aaTest;

import day41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 public class Test {
    public static void main(String[] args) {
        int[] ad = {1, 2, 3, 4};
        for (int n : ad) {
            n++;
        }
        System.out.println(Arrays.toString(ad).replace("[", "").replace("]", ""));

        System.out.println(String.valueOf(new char[]{'c', 'a'}));


        String[] qw = {"asd", "dasd"};
        System.out.println(String.join("", qw));


    String cats = "no cat all cat more cat";
    String[] cat = cats.split("cat");
        System.out.println(cat.length);

        List<Integer> asd = Arrays.stream(ad).boxed().collect(Collectors.toList());
    }

}
