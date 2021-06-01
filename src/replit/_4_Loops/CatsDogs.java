package replit._4_Loops;

public class CatsDogs {
    public static void main(String[] args) {
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = "catxxdogxxxdog";

        for (int i = 0; i < word.length() - 2; i++) {
            String eachThree = word.substring(i, i + 3);
            if (eachThree.equals("cat")) {
                countOfCats++;
            }
            if (eachThree.equals("dog")) {
                countOfDogs++;
            }
        }
        System.out.print(countOfCats == countOfDogs);
    }
}
