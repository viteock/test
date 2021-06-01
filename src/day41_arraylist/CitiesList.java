package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        // add cities to arraylist -> add methods
        cities.add("Naperville");//0
        cities.add("Singera");//1
        cities.add("Chisinau");//2
        cities.add("LA");//3

        //add Vienna to first index
        cities.add(0, "Vienna");
        //print all values in same line
        System.out.println(cities);

        //print first and last city
        System.out.println("First city = " + cities.get(0));
        System.out.println("Last city = " + cities.get(4));
        System.out.println("Last city = " + cities.get(cities.size() - 1));

        //print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("size = " + size);
        System.out.println("there are " + size + " cities in the list");

        //for loop and print all values in same line
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
        //half of cities
        for (int i = 0; i < cities.size() / 2; i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        for (String each : cities) {
            System.out.print(each + " ");
        }
        System.out.println();

        //delete item from arraylist
        //1) remove using index. delete value at index 3
        cities.remove(3);
        //2)remove object/value
        cities.remove("Chisinau");

        System.out.println("after remove = " + cities);

        //delete/remove all values from list
        cities.clear();

        //make sure it's clear
        //1)print| spit it out
        System.out.println("cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }
        //3) check size() == 0
        if (cities.size() == 0) {
            System.out.println("list is empty");
        }
    }
}
