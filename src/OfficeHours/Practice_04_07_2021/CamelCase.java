package OfficeHours.Practice_04_07_2021;

public class CamelCase {
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFind"; // word
        int words = 1;

        if (str.isEmpty()) {
            words = 0;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                words++;

            }

        }

        System.out.println("Words: " + words);
    }
}
