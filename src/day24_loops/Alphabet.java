package day24_loops;

import javax.lang.model.SourceVersion;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
        System.out.println("letter = " + letter);


        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();

        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter + " ");
            letter--;
        }
    }
}
