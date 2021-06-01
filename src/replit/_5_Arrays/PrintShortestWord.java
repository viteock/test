package replit._5_Arrays;

public class PrintShortestWord {
    public static void main(String[] args) {
        String[] str = {"krasav4ik", "son", "bullet", "if", "diemf"};

        //copy from
        String shortestWord = str[0];
        for(int i = 0; i < str.length; i++) {
            if (str[i].length() < shortestWord.length()) {
                shortestWord = str[i];
            }
        }
        System.out.println(shortestWord);
    }
}
