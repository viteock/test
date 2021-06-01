package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("ford");
        myCars.add("Moskvich");
        myCars.add("BMW");
        myCars.add(0, "Jeep");
        myCars.add(1, "Nio");
        myCars.add(2, "yugo");

        //Jeep , Nio , yugo , Toyota , ford , Moskvich, BMW
        System.out.println(myCars.toString()); //prints all cars
        String allCarsIn1St = myCars.toString(); //saves all cars in 1 string variable

        System.out.println("allCarsIn1St = " + allCarsIn1St);

        //change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");

        System.out.println("after set = " + myCars.toString());

        //change index 4 to Honda
        myCars.set(4, "Honda");

        System.out.println("After set honda  = " + myCars.toString());

        /**
         * How would you do that if myCars was array:
         * mycars[4] = "Honda";
         */

        /**
         //find the index number of "ford"
         String str = "java";
         str.indexOf("v") ==> 2
         */
        //find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change moskvich to jiguli
        myCars.set(moskvichIndex, "jiguli");
        System.out.println("after set to jiguli = " + myCars);

        //replace yugo with Hyundai using single statement
        //indexOf("yugo"), Hyundai

        myCars.set(myCars.indexOf("yugo"), "Hyundai");
        System.out.println("after set to Hyundai = " + myCars);

        myCars.add(2, "lada");

        //lada  -> bugatti
        /*
        if myCars contains "lada"
             find index of lada and set value to bugatti
        else
        print "lada is not found "
         */

        if (myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        } else {
            System.out.println("lada is not found");
        }

        System.out.println("after set bugatti = " + myCars.toString());

        /**
         * Lamborghini -> prius
         * lada -> lexus
         * Hyundai -> audi
         */
        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")) {
                //change to prius
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("Toyota")) {
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("Hyundai")) {
                myCars.set(i, "audi");
            }

        }
        System.out.println("after loop = " + myCars);
    }
}
