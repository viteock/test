package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String sentence2 = "hello all";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[words.length - 1 - i] + " ");
        }

        System.out.println("\n\nMurodil's version");
        String reversed = "";
        //print words array in reverse order
        for(int i = words.length - 1; i >= 0; i--) {
            //System.out.print(words[i] +" ");
            reversed += words[i] + " ";
        }

        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed.trim());


    }
}
