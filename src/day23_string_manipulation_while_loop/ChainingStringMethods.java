package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {

        String word = "wooden spoon";

        System.out.println(word.toUpperCase().length());
        System.out.println(word);

        String word1 = "woo den spo on";
        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase());

        String city = "NAPERVILLE";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());


    }
}
