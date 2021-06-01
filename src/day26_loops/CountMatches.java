package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "hawaii";
        char letter = 'w';
        int count = 0;

        for(int z = 0; z < word.length(); z++) {
            count =(word.charAt(z) == letter) ? ++count : count;
        }
        System.out.println(count);
    }
}
