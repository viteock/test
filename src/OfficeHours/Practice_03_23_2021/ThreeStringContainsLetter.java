package OfficeHours.Practice_03_23_2021;

/**
 * -----------------------------------------------------------------
 * <p>
 * Given three String variables of some text find and print the longest wonrd that also cotains 'a'
 * <p>
 * Ex:
 * "java"
 * "mouse"
 * "computer"
 * Output: java
 * Ex:
 * "java"
 * "mouse"
 * "apples"
 * Output: apples
 * <p>
 * Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
 * <p>
 * -----------------------------------------------------------------
 */
public class ThreeStringContainsLetter {
    public static void main(String[] args) {
        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apples";
        String biggestWithA = "";

        if (wordOne.contains("a") && wordOne.length() > biggestWithA.length()) {
            biggestWithA = wordOne;
        }
        if (wordTwo.contains("a") && wordTwo.length() > biggestWithA.length()) {
            biggestWithA = wordTwo;
        }
        if (wordThree.contains("a") && wordThree.length() > biggestWithA.length()) {
            biggestWithA = wordThree;
        }
        if (biggestWithA.isEmpty()) {
            System.out.println("No words contained a!!");
        } else {
            System.out.println("Biggest word with a : " + biggestWithA);
        }
    }
}
