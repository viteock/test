package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "Github";
        System.out.println(word.toUpperCase());

        word = word.replace("hub", "Lab");
        System.out.println("new word = " + word);

        ///gitLab
        //i -> o, a-> gotLib

        String sentence = "java is fun";
        //     String withNoSpace = (sentence.contains(" ")) ? sentence.replace(" ", "") : sentence;
        String withNoSpace = sentence.replace(" ", "");
        System.out.println(withNoSpace);

        //"java" -> "selenium", "fun" ->"a lot of fun" -> assign back to withNoSpaces
        withNoSpace = sentence.replace("java", "selenium").replace("fun", "a lot of fun");
        System.out.println(withNoSpace);

        word = word.replace(" ", "");
        System.out.println(word);

        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ", "")
                        .replace(",", "")
                        .replace(" results for java book", "");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        count++;
        if (count > 0 ) {
            System.out.println("Search successful");
        }
    }
}
