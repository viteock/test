package aTeam;

public class FrequencyChars {
    public static void main(String[] args) {
        String word = "JaJva  is funJJnn";

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            if (!result.contains("" + word.charAt(i))) {
                for (int j = i; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        //                if(("" + word.charAt(i)).equals("" + word.charAt((j)))){
                        count++;
                    }
                }
                result += "" + word.charAt(i) + " = " + count + ", ";
            }
        }
        System.out.println(result.trim());
    }
}
